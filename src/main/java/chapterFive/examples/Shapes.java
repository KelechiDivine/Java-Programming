package chapterFive.examples;

import javax.swing.*;
import java.awt.*;

public class Shapes extends  JPanel{

	int choice;
	
	public Shapes(int choice) {
		this.choice = choice;
	}
	
	public void paintComponent(Graphics graphics){
		
		super.paintComponent(graphics);
		
		for (int i = 0; i < 10;i  = i + 1){
			
			switch (choice) {
				case 1 -> graphics.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				case 2 -> graphics.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
			}
			
		}
	}
}
