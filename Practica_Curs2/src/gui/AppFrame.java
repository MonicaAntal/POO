package gui;
import java.awt.*;
import javax.swing.*;

public class AppFrame extends JFrame{

	private String title = "GUI Test";
	
	public AppFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE); //inherited method, se inchide si procesul 
		setTitle(title);
		setResizable(true);
		setAlwaysOnTop(true);
		setSize(new Dimension(600,200));
		
		Container cp = getContentPane(); 
		cp.setLayout(new FlowLayout()); 
		
		JButton firstButton = new JButton();
		JButton secondButton = new JButton("Cancel");
		
		firstButton.setText("OK");
		firstButton.setToolTipText("Click me!"); 
		firstButton.setForeground(Color.CYAN);
		
		secondButton.setBackground(Color.magenta);
		secondButton.setToolTipText("Cancel");
		secondButton.setEnabled(false);
		
		//cp.add(firstButton);
		//cp.add(secondButton);
		
		JLabel firstLabel = new JLabel("Salut! Ce mai faci?");
		firstLabel.setBackground(Color.ORANGE);
		
		JLabel secondLabel = new JLabel("Salut! Ce mai zici?");
		secondLabel.setBackground(Color.GREEN);
		
		JTextField input = new JTextField(100);
		input.setText("Please fill me.");
		input.setEnabled(true);
		input.setEditable(true);
		
		
		JTextField another = new JTextField();
		another.setText("This is disabled.");
		another.setEnabled(false);
		another.setEditable(false);
		another.setPreferredSize(new Dimension(50,50));
		
		CustomButtons firstCustomButton = new CustomButtons("FIRST", Color.DARK_GRAY, "big");
		CustomButtons secondCustomButton = new CustomButtons("SECOND", Color.PINK, "medium");
		
		cp.add(firstLabel);
		cp.add(input);
		cp.add(firstButton);
		
		cp.add(secondLabel);
		cp.add(another);
		cp.add(secondButton);
		
		cp.add(firstCustomButton);
		cp.add(secondCustomButton);
		
		
		
		
	}
}
