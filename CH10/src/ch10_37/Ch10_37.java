package ch10_37;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CMenuF extends JFrame implements ActionListener
{
	private JMenuItem item1, item2;
	private JPanel panel;
	
	CMenuF()
	{
		panel = new JPanel();
		panel.setBounds(150, 30, 100, 120);
		panel.setBackground(Color.yellow);
		add(panel);
		
		JMenuBar munBar = new JMenuBar();
		munBar.setBounds(0,0,300,20);
		add(munBar);
		
		JMenu menu1 = new JMenu("顏色(C)");
		menu1.setMnemonic(KeyEvent.VK_C);
		munBar.add(menu1);
		
		ButtonGroup group = new ButtonGroup();
		
		item1 = new JRadioButtonMenuItem("紅色");
		item1.addActionListener(this);
		group.add(item1);
		menu1.add(item1);
		
		item2 = new JRadioButtonMenuItem("邊框");
		item2.addActionListener(this);
		group.add(item2);
		menu1.add(item2);	
		
		setTitle("功能表");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (item1.isSelected())
		{
			panel.setBackground(Color.red);
			panel.setBorder(BorderFactory.createLineBorder(Color.black,0));
		}			
		else
		{
			panel.setBackground(Color.YELLOW);
			panel.setBorder(BorderFactory.createLineBorder(Color.black,3));
		}
				
		
		repaint();
	}
}

public class Ch10_37
{

	public static void main(String[] args)
	{
		new CMenuF();

	}

}
