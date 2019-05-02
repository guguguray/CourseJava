// ScrollBar

package ch10_28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

class CScrollBarF extends JFrame implements AdjustmentListener
{
	private JLabel lbl, lblT;
	private JScrollBar scroll;
	private int fs = 0;
	private String lblTs;
	
	CScrollBarF()
	{
		lblTs = String.valueOf(fs);
		lblT = new JLabel(lblTs);
		lblT.setSize(30,20);
		add(lblT, BorderLayout.NORTH);
		
		Font lblF = new Font("標楷體", Font.PLAIN, fs);
		lbl = new JLabel("JAVA");
		lbl.setFont(lblF);
		add(lbl, BorderLayout.CENTER);
		
		scroll = new JScrollBar(JScrollBar.HORIZONTAL, 0,10,0,106);
		scroll.setUnitIncrement(2);
		scroll.addAdjustmentListener(this);
		add(scroll, BorderLayout.SOUTH);
		
		setTitle("捲動軸");
		setBounds(50,50,220,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		fs = scroll.getValue();
		lblTs = String.valueOf(fs);
		Font lblF = new Font("標楷體", Font.PLAIN, fs);
		lblT.setText(lblTs);
		lbl.setFont(lblF);
		repaint();
	}
	
}

public class Ch10_28
{
	public static void main(String[] args)
	{
		new CScrollBarF();
	}
}
