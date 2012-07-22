package main.window;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import main.model.MainModel;
import utils.FileSystemUtils;

public final class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final int WIDTH = 512;
	private static final int HEIGHT = 118;

	private final JTextField tfProject = new JTextField();
	private final JButton btRefresh = new JButton();

	private final JSeparator separator = new JSeparator();

	private final JLabel lbBranch = new JLabel();
	private final JTextField tfBranch = new JTextField();

	private MainModel model;

	public final MainModel getModel() {
		return model;
	}

	public final void setModel(final MainModel model) {
		this.model = model;
	}

	public final void init() {
		setTitle("See It!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLocationRelativeTo(null);
		setResizable(false);
		//
		//
		tfProject.setEditable(false);
		tfProject.setBounds(8, 8, WIDTH - 8 - 96 - 8 - 8, 24);
		getContentPane().add(tfProject);
		//
		btRefresh.setText("refresh");
		btRefresh.setBounds(WIDTH - 8 - 96, 8, 96, 24);
		btRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				btRefreshActionPerformed(evt);
			}
		});
		getContentPane().add(btRefresh);
		//
		separator.setBounds(0, 24 + 8 + 8, WIDTH, 2);
		getContentPane().add(separator);
		//
		lbBranch.setText("Branch:");
		lbBranch.setBounds(8, 24 + 8 + 8 + 8 + 8, 72, 24);
		getContentPane().add(lbBranch);
		//
		tfBranch.setEditable(false);
		tfBranch.setBounds(72 + 8 + 8, 24 + 8 + 8 + 8 + 8, 310, 24);
		getContentPane().add(tfBranch);
		//
		//
		refresh();
		//
		//
		pack();
		setVisible(true);
	}

	private final void refresh() {
		tfProject.setText(FileSystemUtils.getCanonicalPath(model.getProjectPath()));
		tfBranch.setText(model.getBranch());
	}

	private final void btRefreshActionPerformed(final ActionEvent evt) {
		model.refresh();
		refresh();
	}

}
