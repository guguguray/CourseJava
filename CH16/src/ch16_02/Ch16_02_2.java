package ch16_02;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

class CImageF extends JFrame implements ActionListener
{
	private JButton btnSmall, btnChange, btnCls;
	private CGPanel pan1 = new CGPanel();
	private JPanel pan2 = new JPanel();
	private ImageIcon icon =  new ImageIcon("..\\CH16\\src\\ch16_02\\bird.jpg");
	private Image img = icon.getImage();
	
	
	CImageF() 
	{
		pan1.setBounds(20, 20, 320, 265);
		pan1.setBorder(BorderFactory.createLineBorder(Color.red));
		add(pan1);
		
		pan2.setBounds(360, 20, 320, 265);
		pan2.setBackground(Color.YELLOW);
		add(pan2);
		
		btnSmall = new JButton("放大");
		btnSmall.setBounds(420, 300, 90, 25);
		btnSmall.addActionListener(this);
		add(btnSmall);
		
		btnChange = new JButton("上下顛倒");
		btnChange.setBounds(540, 300, 90, 25);
		btnChange.addActionListener(this);
		add(btnChange);
		
		setTitle("影像變形");
		setLayout(null);
		setBounds(50,50,720,380);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class CGPanel extends JPanel
	{
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;			
			g2.drawImage(img, 10, 10, this);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Graphics2D g2 = (Graphics2D) pan2.getGraphics();
		pan2.update(g2);
		
		if (e.getSource() == btnSmall) {
			int x=10;
			int y=10;
			int w=img.getWidth(this)*2;
			int h=img.getHeight(this)*2;
			g2.drawImage(img, x, y, w, h,this);
		}
		
		if (e.getSource() == btnChange) {
			int x1=10;
			int y1=10;
			int x2=img.getWidth(this)+x1;
			int y2=img.getHeight(this)+y1;
			int s_x1 = img.getWidth(this);
			int s_y1 = 0;
			int s_x2 = 0;
			int s_y2 = img.getHeight(this);		
			g2.drawImage(img, x1, y1, x2, y2, s_x1, s_y1, s_x2, s_y2, this);
		}		
	}
}

public class Ch16_02_2
{

	public static void main(String[] args)
	{
		new CImageF();

	}

}
