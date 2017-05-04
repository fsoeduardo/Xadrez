package main;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Interface ui = new Interface();
		
		JFrame frame = new JFrame("Xadrez");
		frame.add(ui);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(512, 534);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
