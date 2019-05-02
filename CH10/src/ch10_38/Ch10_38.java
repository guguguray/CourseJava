package ch10_38;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CPopupMenuF extends JFrame implements ActionListener
{
	private JMenuItem popItem1, popItem2;
	private JPanel panel;
	private JPopupMenu popup;
	
	CPopupMenuF()
	{
		panel = new JPanel();
		panel.setBounds(90, 30, 100, 120);
		panel.setBackground(Color.yellow);
		add(panel);
		
		popup = new JPopupMenu();
		
		popItem1 = new JMenuItem("紅色");
		popItem1.addActionListener(this);
		popup.add(popItem1);
		
		popItem2 = new JMenuItem("邊框");
		popItem2.addActionListener(this);
		popup.add(popItem2);
		
		addMouseListener(new COnPopup());
		
		setTitle("快顯功能表");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==popItem1)
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
	class COnPopup extends MouseAdapter
	{
		public void mouseReleased(MouseEvent e)
		{
			if (e.isPopupTrigger())
				popup.show(e.getComponent(), e.getX(), e.getY());
		}
	}
}
public class Ch10_38
{

	public static void main(String[] args)
	{
		new CPopupMenuF();

	}

}
