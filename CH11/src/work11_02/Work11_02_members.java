package work11_02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


class CMembersF {
	private JFrame frame;
	private JTextField txtID;
	private JTextField txtPwd;
	
	CMembersF()
	{
		frame = new JFrame();
		frame.setTitle("���ڷ|���t��");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblID = new JLabel("�b��:");
		lblID.setBounds(30, 44, 46, 15);
		frame.getContentPane().add(lblID);
		
		JLabel lblPwd = new JLabel("�K�X:");
		lblPwd.setBounds(30, 78, 46, 15);
		frame.getContentPane().add(lblPwd);
		
		txtID = new JTextField();
		txtID.setBounds(86, 41, 96, 21);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtPwd = new JTextField();
		txtPwd.setBounds(87, 75, 96, 21);
		frame.getContentPane().add(txtPwd);
		txtPwd.setColumns(10);
		
		JButton btnInsert = new JButton("�s�W");
		btnInsert.setBounds(10, 217, 70, 23);
		frame.getContentPane().add(btnInsert);
		
		JButton btnQuery = new JButton("�d��");
		btnQuery.setBounds(87, 217, 70, 23);
		frame.getContentPane().add(btnQuery);
		
		JButton btnUpdate = new JButton("��s");
		btnUpdate.setBounds(167, 217, 70, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("�R��");
		btnDelete.setBounds(247, 217, 70, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnExit = new JButton("����");
		btnExit.setBounds(327, 217, 70, 23);
		frame.getContentPane().add(btnExit);
	}
	
}

public class Work11_02_members{	

	public static void main(String[] args)
	{
		
	}	
}
