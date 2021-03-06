 package pc.petko.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Trail extends GameObject{
	
	private float alpha = 1;
	private float life;
	
	private Handler handler;
	private Color color;
	
	private int width, height;
	
	public Trail(float x, float y, ID id, Handler handler, Color color, int width, int height, float life) {
		super (x,y,id);
		this.handler = handler;
		this.height = height;
		this.width = width;
		this.life = life;
		this.color = color;
	}

	@Override
	public void tick() {
		if (alpha > life) {
			alpha -= (life - 0.0001f); // trail expires
		} else {
			handler.removeObject(this); // removes the object if life expires
		}
	}
	
	// Read about it!!!
	private AlphaComposite makeTransparent(float alpha) {
		int type = AlphaComposite.SRC_OVER;
		return(AlphaComposite.getInstance(type,alpha)); 
	}

	// Deals with trail effect
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setComposite(makeTransparent(alpha));
		
		g.setColor(color);
		g.fillRect((int)x,(int) y, width, height); // corresponding trail
		
		g2d.setComposite(makeTransparent(1));
		
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}
	
	

}
