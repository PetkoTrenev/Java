package pc.petko.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class MenuParticle extends GameObject{
	
	private Handler handler;
	private Random r = new Random();
	private Color color;
	
	public MenuParticle(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
		velX = (r.nextInt(5 -  -5) + -5);
		velY = (r.nextInt(5 -  -5) + -5);
		
		// odd spot
		if (velX == 0) velX = 1;
		if (velY == 0) velY = 1; 
		
		color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}

	@Override
	public void tick() {
		x += velX; 
		y += velY;
		
		// Game dimension so the enemy doesn't leave the screen
		if (y <= 0 || y >= Game.HEIGHT - 34) velY *= -1; // reversing the velocity
		if (x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		handler.addObject(new Trail((int)x,(int) y, ID.Trail, handler, color, 16, 16, 0.05f));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect((int)x, (int)y, 16, 16);
	}

	@Override
	public Rectangle getBounds() {	
		return new Rectangle((int)x,(int)y, 16,16);
	}
	
}