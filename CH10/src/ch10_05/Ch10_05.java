package ch10_05;

import javax.swing.*;

public class Ch10_05
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Sample: JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPasswordField pws = new JPasswordField("encryptpassword");
		pws.setBounds(0, 50, 120, 20);
		pws.setEchoChar('*');
		frame.add(pws);
		
		frame.repaint();

	}

}
