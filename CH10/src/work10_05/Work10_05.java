package work10_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CMenuF extends JFrame implements ActionListener
{
	private JMenuItem item11, item12, item13, popItem1, popItem2;
	private JCheckBoxMenuItem sItem211, sItem212;
	private JRadioButtonMenuItem[] sItem22 = new JRadioButtonMenuItem[3];
	private JLabel lbl = new JLabel("顯示文字用");
	private JPopupMenu popup;
	
	CMenuF(){
		JMenuBar munBar = new JMenuBar();
		add(munBar, BorderLayout.NORTH);
		
		JMenu menu1 = new JMenu("內容");
		menu1.setMnemonic(KeyEvent.VK_C);
		munBar.add(menu1);
		
		item11 = new JMenuItem("文字一");
		item11.addActionListener(this);
		menu1.add(item11);
		
		item12 = new JMenuItem("文字二");
		item12.addActionListener(this);
		menu1.add(item12);
		
		menu1.addSeparator();
		
		item13 = new JMenuItem("結束(X)");
		item13.setMnemonic(KeyEvent.VK_X);
		item13.addActionListener(this);
		menu1.add(item13);
		
		JMenu menu2 = new JMenu("格式");
		munBar.add(menu2);
		
		JMenu sMenu21 = new JMenu("樣式");
		menu2.add(sMenu21);
		
		sItem211 = new JCheckBoxMenuItem("斜體");
		sItem211.addActionListener(this);
		sMenu21.add(sItem211);
		
		sItem212 = new JCheckBoxMenuItem("粗體");
		sItem212.addActionListener(this);
		sMenu21.add(sItem212);
		
		menu2.addSeparator();
		
		JMenu sMenu22 = new JMenu("對齊");
		menu2.add(sMenu22);
		
		sItem22[0] = new JRadioButtonMenuItem("靠左",true);
		sItem22[1] = new JRadioButtonMenuItem("置中");
		sItem22[2] = new JRadioButtonMenuItem("靠右");
		
		ButtonGroup group = new ButtonGroup();
		for (int i=0; i < sItem22.length; i++)
		{
			sItem22[i].addActionListener(this);
			group.add(sItem22[i]);
			sMenu22.add(sItem22[i]);			
		}
		
		lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		lbl.setFont(new Font("標楷體", Font.PLAIN, 20));
		add(lbl, BorderLayout.SOUTH);
		
		popup = new JPopupMenu();
		
		popItem1 = new JMenuItem("文字一");
		popItem1.addActionListener(this);
		popup.add(popItem1);
		
		popItem2 = new JMenuItem("文字二");
		popItem2.addActionListener(this);
		popup.add(popItem2);
		
		addMouseListener(new COnPopup());
		
		setTitle("功能表");
		setBounds(50, 50, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int style = Font.PLAIN;
		
		if (e.getSource() == item11 || e.getSource() == popItem1)
		{
			lbl.setText("成功是給堅持到底的人");
			lbl.setForeground(Color.blue);
		}
		
		if (e.getSource() == item12 || e.getSource() == popItem2)
		{
			lbl.setText("機會是給時刻積極的人");
			lbl.setForeground(Color.red);
		}
		
		if (e.getSource() == item13)
			System.exit(0);
		
		if (sItem211.isSelected())
			style = Font.ITALIC;
		
		if (sItem212.isSelected())
			style = Font.BOLD;
		
		if (sItem211.isSelected() & sItem212.isSelected())
			style = Font.BOLD + Font.ITALIC;
		
		lbl.setFont(new Font("標楷體", style, 20));
		
		if (sItem22[0].isSelected())
			lbl.setHorizontalAlignment(JLabel.LEFT);
		
		if (sItem22[1].isSelected())
			lbl.setHorizontalAlignment(JLabel.CENTER);
		
		if (sItem22[2].isSelected())
			lbl.setHorizontalAlignment(JLabel.RIGHT);
	}
	class COnPopup extends MouseAdapter
	{
		public void mouseRelease(MouseEvent e)
		{
			if (e.isPopupTrigger())
				popup.show(e.getComponent(), e.getX(), e.getY());
		}
	}
}
public class Work10_05
{

	public static void main(String[] args)
	{
		new CMenuF();

	}

}
