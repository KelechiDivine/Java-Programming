package chapterSeven.examples.classArrays;

import javax.swing.*;

public class DrawRainbowTest {
	
	public static void main(String[]args){
		
		DrawRainbow rainbow = new DrawRainbow();
		JFrame jFrame = new JFrame();
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(rainbow);
		jFrame.setSize(400, 250);
		jFrame.setVisible(true);
	}
}
