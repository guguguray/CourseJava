// 色彩選擇對話框
package ch10_46;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class CColorChooserF extends JFrame implements ActionListener
{
	private JPanel pan;
	private JButton btnOpen = new JButton("開啟檔案");
	private JButton btnExit = new JButton("結束");
	
	CColorChooserF()
	{
		pan = new JPanel();
		pan.setBounds(0, 0, 200, 150);
		pan.setBorder(BorderFactory.createLineBorder(Color.gray));
		add(pan);
		
		btnOpen.setBounds(220, 10, 90, 30);
		btnOpen.addActionListener(this);
		add(btnOpen);
		
		btnExit.setBounds(220, 50, 90, 30);
		btnExit.addActionListener(this);
		add(btnExit);
		
		setTitle("色彩選擇對話框");
		setLayout(null);
		setBounds(300, 300, 340, 191);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == btnOpen)
		{
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = colorChooser.showDialog(null, "請選擇底色", Color.gray);
			
			pan.setBackground(color);
		}
		else
			System.exit(0);
	}
}
public class Ch10_46
{

	public static void main(String[] args)
	{
		new CColorChooserF();

	}

}
