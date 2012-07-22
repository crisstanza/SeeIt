package main;

import javax.swing.UIManager;

import main.model.MainModel;
import main.window.MainWindow;

public final class Main {

	public static final void main(final String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		final Main main = new Main();
		main.init(args[0]);
	}

	private Main() {
	}

	private final void init(final String projectPath) {
		final MainModel mainModel = new MainModel();
		mainModel.setProjectPath(projectPath);
		mainModel.init();
		//
		final MainWindow mainWindow = new MainWindow();
		mainWindow.setModel(mainModel);
		mainWindow.init();
	}
}
