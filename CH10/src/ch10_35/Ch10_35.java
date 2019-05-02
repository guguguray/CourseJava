package ch10_35;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CMenuF extends JFrame implements ActionListener
{
	private JMenuItem item1, item2, item3;
	private JPanel panel;
	
	CMenuF()
	{
		panel = new JPanel();
		panel.setBackground(Color.black);
		add(panel);
		
		JMenuBar munBar = new JMenuBar();
		add(munBar, BorderLayout.NORTH);
		
		JMenu menu1 = new JMenu("顏色(C)");
		menu1.setMnemonic(KeyEvent.VK_C);
		munBar.add(menu1);
		
		item1 = new JMenuItem("紅色");
		item1.addActionListener(this);
		menu1.add(item1);
		
		item2 = new JMenuItem("藍色");
		item2.addActionListener(this);
		menu1.add(item2);
		
		menu1.addSeparator();
		
		item3 = new JMenuItem("結束(X)");
		item3.setMnemonic(KeyEvent.VK_X);
		item3.addActionListener(this);
		menu1.add(item3);
		
		setTitle("功能表");
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==item1)
			panel.setBackground(Color.red);
		
		if (e.getSource()==item2)
			panel.setBackground(Color.blue);
		
		if (e.getSource()==item3)
			System.exit(0);
		
		repaint();
	}
}
public class Ch10_35
{

	public static void main(String[] args)
	{
		new CMenuF();

	}

}
