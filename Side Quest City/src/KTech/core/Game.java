package KTech.core;

import java.util.Stack;

import KTech.components.State;

public abstract class Game {
	
	private Stack<State> states = new Stack<State>();

	public abstract void update(KTech kt, float time);
	public abstract void render(KTech kt, Renderer r);
	
	public State state() {
		return states.peek();
	}
	
	public void push(State state) {
		states.push(state);
	}
	
	public void remove() {
		states.peek().dispose();
		states.pop();
	}
	
	public void setState(State state) {
		states.pop();
		states.push(state);
	}
}
