package pc.petko.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{
	
	// JDK serial version ?
	private static final long serialVersionUID = 5349965218615004604L;
	
	public Window(int width, int height, String title, Game game) {
		 // Creating a window frames
		 JFrame frame = new JFrame(title);
		 frame.setPreferredSize(new Dimension(width, height));
		 frame.setMaximumSize(new Dimension(width, height));
		 frame.setMinimumSize(new Dimension(width, height));
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if clicked 'x' closes
		 frame.setResizable(false);
		 frame.setLocationRelativeTo(null);   // start's game at the middle of screen
		 frame.add(game);                     // add game to the frame
		 frame.setVisible(true);
		 game.start();
	}
	
}
