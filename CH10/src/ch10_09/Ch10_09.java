// �H�ΦW��ť
package ch10_09;

import javax.swing.*;
import java.awt.event.*;

class CLoginF extends JFrame 
{
	private JTextField txtID, txtShow;
	private JPasswordField pwfPWS;
	private JButton btnOK, btnRST;
		
	CLoginF()
	{
		JFrame frame = new JFrame("�n�J");
		frame.setLayout(null);
		frame.setBounds(100, 100, 235, 230);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTitle= new JLabel("�п�J�b���αK�X");
		lblTitle.setBounds(60,20,200,20);
		frame.add(lblTitle);
		
		JLabel lblID= new JLabel("�b��: ");
		lblID.setBounds(30,50,50,20);
		frame.add(lblID);
		
		txtID = new JTextField();
		txtID.setBounds(70, 50, 120, 20);
		frame.add(txtID);
						
		JLabel lblPWS= new JLabel("�K�X: ");
		lblPWS.setBounds(30,80,50,20);
		frame.add(lblPWS);
			
		pwfPWS = new JPasswordField();
		pwfPWS.setBounds(70, 80, 120, 20);
		pwfPWS.setEchoChar('*');
		frame.add(pwfPWS);	
			
		txtShow = new JTextField();
		txtShow.setBounds(30,120,170,20);
		txtShow.setEditable(false);
		frame.add(txtShow);	
			
		btnOK = new JButton("�T�w");
		btnOK.setBounds(40, 160, 60, 20);
		btnOK.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)	
			{
				String pws = new String(pwfPWS.getPassword());
				if (txtID.getText().equals("MOL") && pws.equals("89956000"))
					txtShow.setText("�b���K�X���T�A�w����{");
				else
					txtShow.setText("�b���K�X���~�A�Э��s��J");
			}
		});	
		frame.add(btnOK);
			
		btnRST = new JButton("����");
		btnRST.setBounds(120, 160, 60, 20);
		btnRST.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)	
			{
				txtID.setText("");
				pwfPWS.setText("");
				txtShow.setText("");
			}	
		});	
		frame.add(btnRST);
			
		frame.repaint(); 
	}		
}

public class Ch10_09
{

	public static void main(String[] args)
	{
		CLoginF loginF = new CLoginF();

	}

}
