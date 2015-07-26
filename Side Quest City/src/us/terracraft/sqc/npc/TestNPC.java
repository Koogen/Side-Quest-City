package us.terracraft.sqc.npc;

import java.awt.event.KeyEvent;
import java.util.Random;

import KTech.components.*;
import KTech.core.*;
import KTech.core.*;
import KTech.graphics.Image;

public class TestNPC extends GameObject {

	Image Test = new Image("/characters/NPC.png");
	
	int x, y;
	
	boolean up, left;
	
	public TestNPC(int x, int y, String displayName) {
		setName("TestNPC"); 
		this.x = x;
		this.y = y;
		
		addComponent(new Collider());
	}
	
	@Override
	public void update(KTech kt, float time) {
		if (y > 30) {
			up = true;
		}
		if (y == 30) {
			up = false;
			left = true;
		}
		if (x < 30) {
			left = false;
		}
		
		if (up == true) {
			y--;
		}
		if (left == true) {
			x--;
		}
		
		updateComponents(kt, time);
	}
	

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(Test, x, y);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void componentEvent(String name, GameObject object) {
		if (name.equalsIgnoreCase("Collider")) {
			if (object.getX() < x) {
				left = false;
			} else {
				//left = true;
			}
			if (object.getY() > y) {
				up = false;
			} else {
				//up = true;
			}
		}
	}

}
