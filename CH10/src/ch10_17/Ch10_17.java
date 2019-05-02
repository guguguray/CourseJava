package ch10_17;

import javax.swing.*;
import java.awt.event.*;

class CMouseAdapF extends JFrame
{
	private JLabel lblShow, lblPic;
	private ImageIcon icon1, icon2, icon3;
	
	CMouseAdapF()
	{
		// ³]©wµøµ¡
		setTitle("·Æ¹«ª¬ºA");
		setLayout(null);
		setBounds(500, 400, 220, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		lblShow = new JLabel("·Æ¹«ª¬ºA");
		lblShow.setBounds(20, 10, 200, 30);
		add(lblShow);
		
		icon1 = new ImageIcon("..\\CH10\\src\\ch10_17\\images\\Scissor.gif");
		icon2 = new ImageIcon("..\\CH10\\src\\ch10_17\\images\\Stone.gif");
		icon3 = new ImageIcon("..\\CH10\\src\\ch10_17\\images\\Paper.gif");
		
		lblPic = new JLabel(icon1);
		lblPic.setBounds(70, 70, 60, 60);
		add(lblPic);
		lblPic.addMouseListener(new CMouseAdap());		
	}
	class CMouseAdap extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			lblShow.setText("·Æ¹«ª¬ºA:·Æ¹««ü¼Ð²¾¤J");
			lblPic.setIcon(icon2);			
		}
		public void mouseExited(MouseEvent e)
		{
			lblShow.setText("·Æ¹«ª¬ºA:·Æ¹««ü¼Ð²¾¥X");
			lblPic.setIcon(icon1);			
		}
		public void mousePressed(MouseEvent e)
		{
			lblShow.setText("·Æ¹«ª¬ºA:·Æ¹««ö¤U");
			lblPic.setIcon(icon3);			
		}
		public void mouseReleased(MouseEvent e)
		{
			lblShow.setText("·Æ¹«ª¬ºA:·Æ¹«©ñ¶}");
			lblPic.setIcon(icon2);			
		}
	}
}
public class Ch10_17
{
	public static void main(String[] args)
	{
		CMouseAdapF mouseF = new CMouseAdapF();

	}

}
