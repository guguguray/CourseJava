package ch10_04;

import javax.swing.*;

public class Ch10_04
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Sample: JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField txt = new JTextField("text field");
		txt.setBounds(0,50,120,20);
		txt.setEditable(false);
		frame.add(txt);
		
		frame.repaint();
	}

}
