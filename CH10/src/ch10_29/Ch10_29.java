//slider

package ch10_29;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import javax.swing.event.*;

class CSliderF extends JFrame implements ChangeListener
{
	private JLabel lbl, lblT;
	private JSlider slider;
	private int fs = 0;
	private String lblTs;
	
	CSliderF()
	{
		lblTs = String.valueOf(fs);
		lblT = new JLabel(lblTs);
		lblT.setSize(30,20);
		add(lblT, BorderLayout.NORTH);
		
		Font lblF = new Font("標楷體", Font.PLAIN, fs);
		lbl = new JLabel("JAVA");
		lbl.setFont(lblF);
		add(lbl, BorderLayout.CENTER);
		
		slider = new JSlider(JScrollBar.HORIZONTAL, 0,96,0);
		slider.setMajorTickSpacing(24);
		slider.setMinorTickSpacing(6);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(this);
		add(slider, BorderLayout.SOUTH);
		
		setTitle("調整器");
		setBounds(50,50,220,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void stateChanged(ChangeEvent e)
	{
		fs = slider.getValue();
		lblTs = String.valueOf(fs);
		Font lblF = new Font("標楷體", Font.PLAIN, fs);
		lblT.setText(lblTs);
		lbl.setFont(lblF);
		repaint();
	}
	
}

public class Ch10_29
{

	public static void main(String[] args)
	{
		new CSliderF();

	}

}
