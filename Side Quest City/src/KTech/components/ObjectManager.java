package KTech.components;

import java.util.ArrayList;

import KTech.core.KTech;
import KTech.core.Renderer;

public class ObjectManager {

	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	public void updateObjects(KTech kt, float time) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).update(kt, time);
			
			if(objects.get(i).isDead())
				objects.remove(i);
		}
	}
	
	public void renderObjects(KTech kt, Renderer r) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).render(kt, r);
		}
	}
	
	public void disposeObjects() {
		for (GameObject go : objects) {
			go.dispose();
		}
	}
	
	public void addObject(GameObject object) {
		objects.add(object);
	}
	
	public GameObject findObject(String name) {
		for(GameObject go : objects) {
			if(go.getName().equalsIgnoreCase(name)) {
				return go;
			}
		}
		
		return null;
	}
}
