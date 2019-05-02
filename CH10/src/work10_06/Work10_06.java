package work10_06;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CFileChooserF extends JFrame implements ActionListener
{
//	private JPanel pan;
	private JButton btnOpen = new JButton("�}���ɮ�");
	private JButton btnExit = new JButton("����");
	private JScrollPane span;
	private JTextField txtFile = new JTextField("�T���C");
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
		
		setTitle("�˵��Ϥ�");
		setLayout(null);
		setBounds(50, 50, 656, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == btnOpen)
		{
			fileChooser.setDialogTitle("�}���ɮ�");			
			// Show open dialog
			int f_open = fileChooser.showOpenDialog(null);
			
			// ���s�P�_
			if (f_open == JFileChooser.APPROVE_OPTION )
			{
				String str = fileChooser.getSelectedFile().getPath();
				ImageIcon photo = new ImageIcon(str);
				span.setViewportView(new JLabel(photo));
				txtFile.setText("�ɮצ�m" + str);
			}
			else
				txtFile.setText("�����}���ɮ�");
			
		}
		else
		{
			int exit = JOptionPane.showConfirmDialog(null, "�T�w����?", "����",
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
