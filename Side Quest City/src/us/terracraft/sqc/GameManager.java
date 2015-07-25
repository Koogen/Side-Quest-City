package us.terracraft.sqc;

import java.awt.event.KeyEvent;

import us.terracraft.sqc.states.MenuState;
import KTech.components.*;
import KTech.core.*;
import KTech.core.*;
import KTech.graphics.Image;

public class GameManager extends Game {
	
	static KTech game;

	public GameManager() {
		push(new MenuState()); //Starting new state, you'd have a state for the menu, different levels, ect
	}
	
	public static void main(String[] args) {
		game = new KTech(new GameManager());
		game.setTitle("Side Quest City");

		game.setWidth(1024 / 2);
		game.setHeight(768 / 2);
		
		game.limitFramerate(false);
		
		game.debugFPS(true);
		
		game.start();
	}
	
	@Override
	public void update(KTech kt, float time) {
		state().update(kt, time); //Do not edit or remove this line
		
		
		if (kt.getInput().isKeyHeld(KeyEvent.VK_ESCAPE))
			game.stop();
	}

	@Override
	public void render(KTech kt, Renderer r) {
		state().render(kt, r); //Do not edit or remove this line
		
		
	}
}
