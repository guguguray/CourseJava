package ch10_24;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


class MyJPanel extends JFrame
{
	MyJPanel()
	{
		setTitle("BorderDemo");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		pan.setBounds(150, 20, 100, 128);
		
		Border lineB = BorderFactory.createLineBorder(Color.black);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "®Ø¬["));
		add(pan);
				
		repaint();
	}
}

public class Ch10_24
{

	public static void main(String[] args)
	{
		new MyJPanel();

	}

}
