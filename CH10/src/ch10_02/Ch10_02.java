package ch10_02;

import java.awt.*;
import javax.swing.*;

// �۩w������k �~�Ӧ� JFrame 
class CMyFrame extends JFrame
{
	CMyFrame() {
		// �]�w���A�� Image �� img ����
		Image img = Toolkit.getDefaultToolkit().getImage("..\\CH10\\src\\ch10_02\\images\\octopus.gif");
		setTitle("swing window program 2");
		setIconImage(img);
		setLocation(550, 300);
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
public class Ch10_02
{

	public static void main(String[] args)
	{
		JFrame frame1 = new JFrame("swing window program 1");
		frame1.setVisible(true);
		frame1.setBounds(150, 100, 400, 200);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CMyFrame frame2 = new CMyFrame(); 
	}

}
