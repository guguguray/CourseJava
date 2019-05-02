package work10_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CMenuF extends JFrame implements ActionListener
{
	private JMenuItem item11, item12, item13, popItem1, popItem2;
	private JCheckBoxMenuItem sItem211, sItem212;
	private JRadioButtonMenuItem[] sItem22 = new JRadioButtonMenuItem[3];
	private JLabel lbl = new JLabel("��ܤ�r��");
	private JPopupMenu popup;
	
	CMenuF(){
		JMenuBar munBar = new JMenuBar();
		add(munBar, BorderLayout.NORTH);
		
		JMenu menu1 = new JMenu("���e");
		menu1.setMnemonic(KeyEvent.VK_C);
		munBar.add(menu1);
		
		item11 = new JMenuItem("��r�@");
		item11.addActionListener(this);
		menu1.add(item11);
		
		item12 = new JMenuItem("��r�G");
		item12.addActionListener(this);
		menu1.add(item12);
		
		menu1.addSeparator();
		
		item13 = new JMenuItem("����(X)");
		item13.setMnemonic(KeyEvent.VK_X);
		item13.addActionListener(this);
		menu1.add(item13);
		
		JMenu menu2 = new JMenu("�榡");
		munBar.add(menu2);
		
		JMenu sMenu21 = new JMenu("�˦�");
		menu2.add(sMenu21);
		
		sItem211 = new JCheckBoxMenuItem("����");
		sItem211.addActionListener(this);
		sMenu21.add(sItem211);
		
		sItem212 = new JCheckBoxMenuItem("����");
		sItem212.addActionListener(this);
		sMenu21.add(sItem212);
		
		menu2.addSeparator();
		
		JMenu sMenu22 = new JMenu("���");
		menu2.add(sMenu22);
		
		sItem22[0] = new JRadioButtonMenuItem("�a��",true);
		sItem22[1] = new JRadioButtonMenuItem("�m��");
		sItem22[2] = new JRadioButtonMenuItem("�a�k");
		
		ButtonGroup group = new ButtonGroup();
		for (int i=0; i < sItem22.length; i++)
		{
			sItem22[i].addActionListener(this);
			group.add(sItem22[i]);
			sMenu22.add(sItem22[i]);			
		}
		
		lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		lbl.setFont(new Font("�з���", Font.PLAIN, 20));
		add(lbl, BorderLayout.SOUTH);
		
		popup = new JPopupMenu();
		
		popItem1 = new JMenuItem("��r�@");
		popItem1.addActionListener(this);
		popup.add(popItem1);
		
		popItem2 = new JMenuItem("��r�G");
		popItem2.addActionListener(this);
		popup.add(popItem2);
		
		addMouseListener(new COnPopup());
		
		setTitle("�\���");
		setBounds(50, 50, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int style = Font.PLAIN;
		
		if (e.getSource() == item11 || e.getSource() == popItem1)
		{
			lbl.setText("���\�O������쩳���H");
			lbl.setForeground(Color.blue);
		}
		
		if (e.getSource() == item12 || e.getSource() == popItem2)
		{
			lbl.setText("���|�O���ɨ�n�����H");
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
		
		lbl.setFont(new Font("�з���", style, 20));
		
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
