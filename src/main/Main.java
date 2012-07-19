package main;

import main.window.MainWindow;

public final class Main {

	public static final void main(final String[] args) {
		final Main main = new Main();
	}

	private Main() {
		init();
	}

	private final void init() {
		final MainWindow mainWindow = new MainWindow();
	}

}
