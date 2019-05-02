package ch16_01;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class CImageF extends JFrame 
{
	CImageF() {
		CGPanel pan = new CGPanel();
		pan.setBounds(20, 20, 1000, 700);
		add(pan);
		
		setTitle("顯示影像");
		setLayout(null);
		setBounds(50,50,1050,750);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class CGPanel extends JPanel
{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		ImageIcon icon =  new ImageIcon("..\\CH16\\src\\ch16_01\\fish.jpg");
		Image img = icon.getImage();
		g2.drawImage(img, 0, 0, this);
	}
}

public class Ch16_01
{

	public static void main(String[] args)
	{
		new CImageF();
	}
}
