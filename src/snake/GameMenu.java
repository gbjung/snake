package snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class GameMenu extends JMenuBar implements ActionListener {
	private final JFrame WINDOW = new JFrame();
	private static final long serialVersionUID = -5995961800376482109L;
	private final JMenu M_GAME, M_DIFFICULTY, M_SCORE, M_ABOUT;
	private final JMenuItem MI_RESTART, MI_EASY,
			MI_MEDIUM, MI_HARD, MI_SCOREBOARD, MI_CREDITS;
	String difficulty;
	boolean reverse;
	public static int expectFrequency = 80000;
	

	public void stop() {
		
	}
	public void renew() {
		System.out.println("Let's Start again");
		new Frame();
	}

	public void setDifficulty(String difficulty) { //tried to implement a difficulty setting but couldn't get it right
		this.difficulty = difficulty;
		switch (difficulty) {
		case "Easy":
			expectFrequency = 160000;
			reverse = false;
			break;
		case "Medium":
			expectFrequency = 80000;
			reverse = false;
			break;
		case "Hard":
			expectFrequency = 40000;
			reverse = false;
			break;
		default:
			break;
		}
		}

	public GameMenu() { //creates the JMenu
		
		M_GAME = new JMenu("Game");
		M_DIFFICULTY = new JMenu("Difficulty");
		M_SCORE = new JMenu("Score");
		M_ABOUT = new JMenu("About");

		MI_RESTART = new JMenuItem("Restart");


		MI_SCOREBOARD = new JMenuItem("Scoreboard");

		MI_EASY = new JMenuItem("Easy");
		MI_MEDIUM = new JMenuItem("Medium");
		MI_HARD = new JMenuItem("Hard");
		MI_CREDITS = new JMenuItem("Credits");


		add(M_GAME);
		add(M_DIFFICULTY);
		add(M_SCORE);
		add(M_ABOUT);
		M_GAME.add(MI_RESTART);
		M_DIFFICULTY.add(MI_HARD);
		M_DIFFICULTY.add(MI_MEDIUM);
		M_DIFFICULTY.add(MI_EASY);
		M_SCORE.add(MI_SCOREBOARD);
		M_ABOUT.add(MI_CREDITS);

		MI_RESTART.addActionListener(this);
		MI_EASY.addActionListener(this);
		MI_MEDIUM.addActionListener(this);
		MI_HARD.addActionListener(this);
		MI_SCOREBOARD.addActionListener(this);
		MI_CREDITS.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) { //actions happening based on JMenu pressed
		if (e.getSource().equals(MI_RESTART)) {
			stop();
			renew();
		}
		if (e.getSource().equals(MI_EASY)) {
			stop();
			renew();
			setDifficulty("Easy");
		}
		if (e.getSource().equals(MI_MEDIUM)) {
			stop();
			renew();
			setDifficulty("Medium");
		}
		if (e.getSource().equals(MI_HARD)) {
			stop();
			renew();
			setDifficulty("Hard");
		}
		if (e.getSource().equals(MI_CREDITS)) {
			JOptionPane.showMessageDialog(WINDOW, "by Gyeongbae Jung and Erik Monzo" + "\n"
					+ "for CS281...Made with love...", "Credits",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
		
}



