package ch10_39;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CToolBarF extends JFrame implements ActionListener
{
	private JPanel pan = new JPanel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();
	private JLabel lblPic = new JLabel();

	
	CToolBarF()
	{
		JToolBar toolBar = new JToolBar("工具列", JToolBar.HORIZONTAL);
		ImageIcon icon1 = new ImageIcon("..\\CH10\\src\\ch10_39\\images\\open.jpg");
		ImageIcon icon2 = new ImageIcon("..\\CH10\\src\\ch10_39\\images\\close.jpg");
		
		btn1 = new JButton(icon1);
		btn1.addActionListener(this);
		btn1.setToolTipText("開啟圖檔");
		toolBar.add(btn1);
		
		btn2 = new JButton(icon2);
		btn2.addActionListener(this);
		btn2.setToolTipText("關閉程式");
		toolBar.add(btn2);
		
		pan.setLayout(new BorderLayout());
		pan.add(toolBar, BorderLayout.NORTH);
		
		pan.add(lblPic, BorderLayout.CENTER);
		
		add(pan);
		
		setTitle("工具列");
		setBounds(100, 100, 300, 240);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btn1)
		{
			lblPic.setIcon(new ImageIcon("..\\CH10\\src\\ch10_39\\images\\Tower.jpg"));
		}			
		
		if (e.getSource()==btn2)
			System.exit(0);
		
	}	
}

public class Ch10_39
{

	public static void main(String[] args)
	{
		new CToolBarF();

	}

}
