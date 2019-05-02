package work10_06;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CFileChooserF extends JFrame implements ActionListener
{
//	private JPanel pan;
	private JButton btnOpen = new JButton("開啟檔案");
	private JButton btnExit = new JButton("結束");
	private JScrollPane span;
	private JTextField txtFile = new JTextField("訊息列");
	private JFileChooser fileChooser = new JFileChooser();
	
	CFileChooserF()
	{
		
		
		
//		pan = new JPanel();
//		pan.setBounds(0, 0, 200, 150);
//		pan.setBorder(BorderFactory.createLineBorder(Color.red));
//		add(pan);
		
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
			fileChooser.setDialogTitle("開啟檔案");			
			// Show open dialog
			int f_open = fileChooser.showOpenDialog(null);
			
			// 按鈕判斷
			if (f_open == JFileChooser.APPROVE_OPTION )
			{
				String str = fileChooser.getSelectedFile().getPath();
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

public class Work10_06
{

	public static void main(String[] args)
	{
		new CFileChooserF();

	}

}
