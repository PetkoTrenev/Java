import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class App extends JFrame {
	public App() {
		
		JLabel lblPetkoTrenevsHilo = new JLabel("Petko Trenev's Hi-Lo Guessing Game");
		lblPetkoTrenevsHilo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblPetkoTrenevsHilo, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
