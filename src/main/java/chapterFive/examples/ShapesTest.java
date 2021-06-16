package chapterFive.examples;

import javax.swing.*;

public class ShapesTest {

	public static void main(String[] args){
	
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangle\n" +
				"Enter 2 to draw oval");
		
		int choice  = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
