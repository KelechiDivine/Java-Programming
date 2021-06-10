package chapterThree.gui;

import javax.swing.*;

public class NameDialog {
	
	public static void main(String[] args){
	
		String name = JOptionPane.showInputDialog("What's your name? ");
		
		String message = String.format("Welcome, %s, to java programming!", name);
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}
