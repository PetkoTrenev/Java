package pc.petko.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class EnemyBossBullet extends GameObject{
	
	private Handler handler;
	private Random r = new Random();
	
	public EnemyBossBullet(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		velX = (r.nextInt(5 -  -5) + -5); //random number from +5 to -5
		velY = 5;
		
	}

	@Override
	public void tick() {
		x += velX; 
		y += velY;
		
		// Game dimension so the enemy doesn't leave the screen
		//if (y <= 0 || y >= Game.HEIGHT - 34) velY *= -1; // reversing the velocity
		//if (x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		if ( y >= Game.HEIGHT ) handler.removeObject(this);
 		
		handler.addObject(new Trail((int)x+48,(int) y+48, ID.Trail, handler, Color.red, 16, 16, 0.02f));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int)x, (int)y, 16, 16);
	}

	@Override
	public Rectangle getBounds() {	
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	
}