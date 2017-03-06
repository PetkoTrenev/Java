package pc.petko.main;

import java.awt.Graphics;
import java.util.LinkedList;

/*
 * Maintain update and render all the objects
 * 
 */
public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for (int i = 0; i < object.size(); i++) {  // loops all objects
			GameObject tempObject = object.get(i); // get an object
			tempObject.tick();					   // tick ???
			
		}
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	
	public void clearEnemies() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if (tempObject.getId() == ID.Player) {
				object.clear();
				addObject(new Player((int) tempObject.getX(), (int) tempObject.getY(), ID.Player, this));
			}
		}
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

}
