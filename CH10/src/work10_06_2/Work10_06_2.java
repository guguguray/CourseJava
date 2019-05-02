package work10_06_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CFileChooserF extends JFrame implements ActionListener
{
	private JButton btnOpen = new JButton("開啟檔案");
	private JButton btnExit = new JButton("結束");
	private JScrollPane span;
	private JTextField txtFile = new JTextField("訊息列");
	private FileDialog fileDialog1;
	private String file_dir, file_name;
	
	CFileChooserF()
	{
			
		btnOpen.setBounds(210, 10, 90, 30);
		btnOpen.addActionListener(this);
		add(btnOpen);
		
		btnExit.setBounds(330, 10, 90, 30);
		btnExit.addActionListener(this);
		add(btnExit);
		
		span = new JScrollPane();
		span.setBounds(0, 50, 640, 480);
		add(span);
		
		txtFile.setBounds(0, 530, 640, 30);
		txtFile.setEditable(false);
		add(txtFile);
		
		setTitle("檢視圖片");
		setLayout(null);
		setBounds(50, 50, 656, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == btnOpen)
		{
			fileDialog1 = new FileDialog(this, "開啟檔案", FileDialog.LOAD);
			fileDialog1.setVisible(true);
			
			file_dir = fileDialog1.getDirectory();
			file_name =  fileDialog1.getFile();
			
			if (file_name != null )
			{
				String str = file_dir + file_name;
				ImageIcon photo = new ImageIcon(str);
				span.setViewportView(new JLabel(photo));
				txtFile.setText("檔案位置" + str);
			}
			else
				txtFile.setText("取消開啟檔案");
			
		}
		else
		{
			int exit = JOptionPane.showConfirmDialog(null, "確定結束?", "結束",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if (exit == JOptionPane.YES_OPTION)
				System.exit(0);
		}
			
	}
}
public class Work10_06_2
{

	public static void main(String[] args)
	{
		new CFileChooserF();

	}

}
