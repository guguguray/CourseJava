package ch10_06;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ch10_06
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Sample: JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("..\\CH10\\src\\ch10_06\\images\\Horse.gif");
		
		JButton btn = new JButton("«ö¶s", icon);
		btn.setBounds(0, 50, 150, 50);
		frame.add(btn);
		
		frame.repaint();
	}

}
