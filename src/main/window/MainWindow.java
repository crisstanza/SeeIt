package main.window;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public final class MainWindow extends JFrame {

	private final JTextField tfProject = new JTextField();
	private final JButton btRefresh = new JButton();

	private final JSeparator separator = new JSeparator();

	private final JLabel lbBranch = new JLabel();
	private final JTextField tfBranch = new JTextField();

	public MainWindow() {
		init();
	}

	private final void init() {
		setTitle("See It!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setPreferredSize(new Dimension(402, 118));
		setLocationRelativeTo(null);
		setResizable(false);
		//
		//
		tfProject.setEditable(false);
	        tfProject.setBounds(8, 8, 280, 24);
	        getContentPane().add(tfProject);
		//
		btRefresh.setText("refresh");
	        btRefresh.setBounds(280+8+8, 8, 96, 24);
		btRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				btRefreshActionPerformed(evt);
			}
		});
	        getContentPane().add(btRefresh);
		//
	        separator.setBounds(0, 24+8+8, 402, 2);
	        getContentPane().add(separator);
		//
		lbBranch.setText("Branch:");
	        lbBranch.setBounds(8, 24+8+8+8+8, 72, 24);
	        getContentPane().add(lbBranch);
		//
		tfBranch.setEditable(false);
	        tfBranch.setBounds(72+8+8, 24+8+8+8+8, 200, 24);
	        getContentPane().add(tfBranch);
		//
		//
		pack();
		setVisible(true);
	}

	private final void btRefreshActionPerformed(final ActionEvent evt) {
	}

}
