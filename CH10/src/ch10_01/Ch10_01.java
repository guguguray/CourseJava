// window with title
package ch10_01;

import javax.swing.*;

public class Ch10_01
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Swing Windows Program");
		frame.setVisible(true);
		frame.setBounds(150, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
