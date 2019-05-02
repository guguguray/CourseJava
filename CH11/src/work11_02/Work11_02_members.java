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
		frame.setTitle("捐款會員系統");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblID = new JLabel("帳號:");
		lblID.setBounds(30, 44, 46, 15);
		frame.getContentPane().add(lblID);
		
		JLabel lblPwd = new JLabel("密碼:");
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
		
		JButton btnInsert = new JButton("新增");
		btnInsert.setBounds(10, 217, 70, 23);
		frame.getContentPane().add(btnInsert);
		
		JButton btnQuery = new JButton("查詢");
		btnQuery.setBounds(87, 217, 70, 23);
		frame.getContentPane().add(btnQuery);
		
		JButton btnUpdate = new JButton("更新");
		btnUpdate.setBounds(167, 217, 70, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("刪除");
		btnDelete.setBounds(247, 217, 70, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnExit = new JButton("結束");
		btnExit.setBounds(327, 217, 70, 23);
		frame.getContentPane().add(btnExit);
	}
	
}

public class Work11_02_members{	

	public static void main(String[] args)
	{
		
	}	
}
