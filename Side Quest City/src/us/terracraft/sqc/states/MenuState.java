package us.terracraft.sqc.states;

import java.awt.event.KeyEvent;

import us.terracraft.sqc.GameManager;
import us.terracraft.sqc.objects.Background;
import KTech.components.*;
import KTech.core.*;
import KTech.graphics.*;

public class MenuState implements State {
	
	private ObjectManager manager;
	
	Image title = new Image("/misc/sqc.png");
	SoundClip song = new SoundClip("/sounds/theme.wav");
	
	public MenuState() {
		manager = new ObjectManager();
		
		manager.addObject(new Background(0,0, "/Backgrounds/Menubg.png"));

		song.loop();
	}
	
	@Override
	public void update(KTech kt, float time) {
		manager.updateObjects(kt, time); //Do not edit or remove this line
		
		if (kt.getInput().isKeyHeld(KeyEvent.VK_ENTER))
			GameManager.setState(new PlayState());
	}

	@Override
	public void render(KTech kt, Renderer r) {
		manager.renderObjects(kt, r); //Do not edit or remove this line
		
		r.drawImage(title, 50, 50);
		
		r.drawString("Press Enter to start", 0xffffffff, 220, 300);
	}

	@Override
	public void dispose() {
		//Make sure to dispose of all game objects to avoid memory leaks 

		
		manager.disposeObjects();
	}
}
