package pc.petko.main;

import java.awt.Graphics;
import java.util.ArrayList;

/*
 * Maintain update and render all the objects
 * 
 */
public class Handler {
	
	ArrayList<GameObject> object = new ArrayList<GameObject>();
	
	public void tick() {
		for (int i = 0; i < object.size(); i++) {  // loops all objects
			GameObject tempObject = object.get(i); // get an object
			tempObject.tick();					   // tick ???
			
		}
	}
	
	public void render(Graphics g) {
		try {
			for (int i = 0; i < object.size(); i++) {
				GameObject tempObject = object.get(i);
				tempObject.render(g);
			}		
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		
	}
	
	public void clearEnemies() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if (tempObject.getId() == ID.Player) {
				object.clear();
				if (Game.gameState != Game.STATE.End) // clears player from death menu
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
