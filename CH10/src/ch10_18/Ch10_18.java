package ch10_18;

import javax.swing.*;
import java.awt.event.*;

class CMouseAdapF extends JFrame
{
	private JLabel lblX, lblY;
	
	CMouseAdapF()
	{
		setTitle("顯示滑鼠的指標座標");
		setLayout(null);
		setBounds(500, 400, 260, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		lblX = new JLabel("x=");
		lblX.setBounds(140, 140, 50, 20);
		add(lblX);
		
		lblY = new JLabel("y=");
		lblY.setBounds(200, 140, 50, 20);
		add(lblY);	
		addMouseMotionListener(new CMousePos());
	}
	class CMousePos extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent e)
		{
			lblX.setText("x="+e.getX());
			lblY.setText("y="+e.getY());
		}		
	}
}


public class Ch10_18
{

	public static void main(String[] args)
	{
		CMouseAdapF mouseF = new CMouseAdapF();

	}

}
