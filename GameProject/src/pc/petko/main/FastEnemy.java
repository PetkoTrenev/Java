package pc.petko.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class FastEnemy extends GameObject{
	
	private Handler handler;
	
	public FastEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		velX = 2;
		velY = 9;
	}

	@Override
	public void tick() {
		x += velX; 
		y += velY;
		
		// Game dimension so the enemy doesn't leave the screen
		if (y <= 0 || y >= Game.HEIGHT - 34) velY *= -1; // reversing the velocity
		if (x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		handler.addObject(new Trail((int)x,(int) y, ID.Trail, handler, Color.cyan, 16, 16, 0.02f));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect((int)x, (int)y, 16, 16);
	}

	@Override
	public Rectangle getBounds() {	
		return new Rectangle((int)x,(int)y, 16,16);
	}
	
}
