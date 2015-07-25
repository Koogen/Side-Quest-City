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
	
	public TestNPC(int x, int y, String displayName) {
		setName("TestNPC"); 
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void update(KTech kt, float time) {
		if (y > 30) {
			y--;
		}
		if (y == 30 && x > 30) {
			x--;
		}
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
		
	}

}
