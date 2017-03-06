package pc.petko.main;

import java.util.Random;

public class Spawn{
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {   // no initialization?
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		// timer or scoring system for leveling up
		scoreKeep++;
		
		// actual scoring system
		if (scoreKeep >= 200) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1); // interaction with heads up display
			
			
			// adds a new enemy object each level up
			if (hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT- 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SmartEnemy, handler));
			}else if (hud.getLevel() == 10) {
				handler.clearEnemies();	
				handler.addObject(new EnemyBoss((Game.WIDTH /2 ) - 48, -120, ID.EnemyBoss, handler));
			} 
		}
	}
	

}
