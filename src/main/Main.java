package main;

import javax.swing.UIManager;

import main.window.MainWindow;

public final class Main {

	public static final void main(final String[] args) throws Exception {
		final Main main = new Main();
	}

	private Main() throws Exception {
		init();
	}

	private final void init() throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		final MainWindow mainWindow = new MainWindow();
	}

}
