package ch10_02;

import java.awt.*;
import javax.swing.*;

// 自定視窗方法 繼承自 JFrame 
class CMyFrame extends JFrame
{
	CMyFrame() {
		// 設定型態為 Image 的 img 物件
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
