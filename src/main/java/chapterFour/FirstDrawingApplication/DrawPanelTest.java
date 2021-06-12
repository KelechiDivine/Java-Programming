package chapterFour.FirstDrawingApplication;

import javax.swing.*;

public class DrawPanelTest {

	public static void main(String[] args){
	
		DrawPanel drawPanel = new DrawPanel();
		
		JFrame jFrame = new JFrame();
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		jFrame.add(drawPanel);
		
		jFrame.setSize(250, 250);
		
		jFrame.setVisible(true);
	}
}
