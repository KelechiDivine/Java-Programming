package chapterSeven.examples.classArrays;

import javax.swing.*;
import java.awt.*;

public class DrawRainbow extends JPanel {
	
	private final static Color VIOLET = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);
	
	private Color[] colors = {
			
			Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
	};
	
	public DrawRainbow(){
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int radius = 20;
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;
		
		for (int counter = colors.length; counter > 0; counter = counter - 1){
			
			graphics.setColor(colors[counter - 1]);
			
			graphics.fillArc(centerX - counter * radius, centerY - counter * radius,
					counter * radius * 2, counter * radius * 2, 0,
					180);
		}
	}
}
