package us.terracraft.sqc;

import java.awt.event.KeyEvent;

import KTech.components.*;
import KTech.core.*;
import KTech.graphics.*;

public class Player extends GameObject {

	Image test = new Image("/test.jpg");
	
	public Player(int x, int y) {
		setName("Player");
		this.x = x;
		this.y = y;
		width = 16;
		height = 64;
	}
	
	@Override
	public void update(KTech kt, float time) {	
		if (kt.getInput().isKeyHeld(KeyEvent.VK_UP)) {
			y -= 3;
			
			if (y < 0)
				y = 0;
		}
		
		if (kt.getInput().isKeyHeld(KeyEvent.VK_DOWN)) {
			y += 3;
			
			if (y + height > kt.getHeight())
				y = kt.getHeight() - height;
		}
		
		updateComponents(kt, time);	
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(test, x, y);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void componentEvent(String name, GameObject object) {
		
	}
}
