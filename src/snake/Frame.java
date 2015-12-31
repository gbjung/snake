package snake;
import javax.swing.JFrame;

import java.awt.GridLayout;



import snake.graphics.Screen;
public class Frame extends JFrame {

	
	private static final long serialVersionUID = 1L;

	//tried to make this the main GUI, but due to dividing work load, it didn't happen 100%
	public Frame() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		setResizable(false);
		setJMenuBar(new GameMenu());
		init();
	}
	
	public void init() { //initializes, packs, and makes the program visible
		setLayout(new GridLayout(1, 1, 0, 0));
		
		Screen s = new Screen();
		add(s);
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
