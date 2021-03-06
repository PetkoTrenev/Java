package pc.petko.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class EnemyBoss extends GameObject {

	private Handler handler;
	Random r = new Random();

	private int timer = 80;
	private int timer2 = 50;

	public EnemyBoss(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		velX = 0;
		velY = 2;

	}

	@Override
	public void tick() {
		x += velX;
		y += velY;

		if (x <= 0 || x >= Game.WIDTH - 88)
			velX *= -1;
		// Stop him at a spot
		if (timer <= 0) {
			velY = 0;
		} else {
			timer--;
		}
		if (timer <= 0)
			timer2--;
		if (timer2 <= 0) {
			if (velX == 0) velX = 2;
			int spawn = r.nextInt(10);
			if (spawn == 0)	handler.addObject(new EnemyBossBullet((int) x, (int) y, ID.BasicEnemy, handler));
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) x, (int) y, 96, 96);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) x, (int) y, 96, 96);
	}

}
