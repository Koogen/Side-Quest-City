package us.terracraft.sqc.states;

import java.awt.event.KeyEvent;

import us.terracraft.sqc.GameManager;
import us.terracraft.sqc.items.IronSword;
import us.terracraft.sqc.objects.Cursor;
import KTech.components.ObjectManager;
import KTech.components.State;
import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.graphics.Image;

public class Inventory implements State {
	
	private static ObjectManager manager;
	
	public Inventory() {
		manager = new ObjectManager();
		
		manager.addObject(new IronSword(275 ,60));
		manager.addObject(new Cursor());
	}
	
	@Override
	public void update(KTech kt, float time) {
		manager.updateObjects(kt, time); //Do not edit or remove this line
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_E))
			GameManager.setState(new PlayState());
		
	}

	@Override
	public void render(KTech kt, Renderer r) {
		manager.renderObjects(kt, r); //Do not edit or remove this line
	}
	@Override
	public void dispose() {
		//Make sure to dispose of all game objects to avoid memory leaks 

		
		manager.disposeObjects();
	}
	
	public static void use(String item) {
		manager.findObject(item).dispose();;
	}
}
