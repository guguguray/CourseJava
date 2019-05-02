// Scrollbar

package ch10_27;

import javax.swing.*;
import java.awt.*;

class CScrollPaneF extends JFrame
{
	CScrollPaneF()
	{
		ImageIcon photo = new ImageIcon("..\\CH10\\src\\ch10_27\\images\\lighthouse.jpg");
		JScrollPane span = new JScrollPane(new JLabel(photo), 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		span.setBounds(6,6,336,275);
		add(span);
		
		setTitle("±²°Ê¶b");
		setLayout(null);
		setBounds(50,50,355,320);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
public class Ch10_27
{

	public static void main(String[] args)
	{
		new CScrollPaneF();

	}

}
