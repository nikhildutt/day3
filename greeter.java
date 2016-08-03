package day3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "State your name.");
		JOptionPane.showConfirmDialog(null, "Hello " + name + ", it's a pleasure meeting you");
	}

}
