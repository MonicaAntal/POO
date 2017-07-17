package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class CustomButtons extends JButton{

	public CustomButtons(String title, Color color, String size){
	
		setText(title);
		setBackground(color);
		
		Dimension smallSize = new Dimension(30,20);
		Dimension mediumSize = new Dimension(70,50);
		Dimension bigSize = new Dimension(120,100);
	
		switch (size) {
		case "small":
			setPreferredSize(smallSize);
			break;
		case "medium":
			setPreferredSize(mediumSize);
			break;
		case "big":
			setPreferredSize(bigSize);
		default:
			break;
		}
	}
}
