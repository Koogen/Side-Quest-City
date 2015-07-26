package us.terracraft.sqc.objects;

import java.awt.event.KeyEvent;

import us.terracraft.sqc.states.*;

import KTech.components.*;
import KTech.core.*;
import KTech.graphics.Image;

public class Cursor extends GameObject {

	Image cursor = new Image("/misc/cursor.png");
	
	int row = 1, colum = 1;
	int x, y;
	
	
	int i1, i2, i3,
		i4, i5, i6,
		i7, i8, i9;
	
	public Cursor() {
		setName("Cursor");
	}
	
	@Override
	public void update(KTech kt, float time) {
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_RIGHT))
			colum++;
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_LEFT))
			colum--;
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_DOWN))
			row++;
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_UP))
			row--;
		
		if (row == 1)
			y = 60;
		if (row == 2)
			y = 129;
		if (row == 3) 
			y = 198;
		
		if (colum == 1)
			x = 275;
		if (colum == 2) 
			x = 344;
		if (colum == 3)
			x = 413;
		
		if (colum < 1)
			colum = 1;
		if (colum > 3)
			colum = 3;
		
		if (row < 1)
			row = 1;
		if (row > 3)
			row = 3;
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_ENTER))
			Inventory.use("IronSword");
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawString("Inventory", 0xffffffff, 5, 5);
		r.drawImage(cursor, x, y);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void componentEvent(String name, GameObject object) {
		
	}

}
