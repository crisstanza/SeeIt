package main.window;

import java.awt.Dimension;
import javax.swing.JFrame;

public final class MainWindow extends JFrame {

	public MainWindow() {
		init();
	}

	private final void init() {
		setTitle("See It!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400, 110));
		setLocationRelativeTo(null);
		pack();
	        setResizable(false);
		setVisible(true);

		System.out.println("test seven");
	}

}
