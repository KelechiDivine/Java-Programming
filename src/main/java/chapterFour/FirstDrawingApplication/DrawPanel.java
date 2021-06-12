package chapterFour.FirstDrawingApplication;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
	
	public void paintComponent(Graphics graphics){
	
		super.paintComponent(graphics);
		
		int width = getWidth();
		int height = getHeight();
		
		graphics.drawLine(0, 0, width, height);
		
		graphics.drawLine(0,  height, width, 0);
	}


}
