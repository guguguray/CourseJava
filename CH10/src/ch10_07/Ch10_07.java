// 視窗監聽
package ch10_07;
import javax.swing.*;
import java.awt.event.*;

class CLoginF extends JFrame implements ActionListener
{
	private JTextField txtID, txtShow;
	private JPasswordField pwfPWS;
	private JButton btnOK, btnRST;
		
	CLoginF()
	{
		JFrame frame = new JFrame("登入");
		frame.setLayout(null);
		frame.setBounds(100, 100, 235, 230);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTitle= new JLabel("請輸入帳號及密碼");
		lblTitle.setBounds(60,20,200,20);
		frame.add(lblTitle);
		
		JLabel lblID= new JLabel("帳號: ");
		lblID.setBounds(30,50,50,20);
		frame.add(lblID);
		
		txtID = new JTextField();
		txtID.setBounds(70, 50, 120, 20);
		frame.add(txtID);
						
		JLabel lblPWS= new JLabel("密碼: ");
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
			
		btnOK = new JButton("確定");
		btnOK.setBounds(40, 160, 60, 20);
		btnOK.addActionListener(this);		// 註冊整個視窗監聽
		frame.add(btnOK);
			
		btnRST = new JButton("重來");
		btnRST.setBounds(120, 160, 60, 20);
		btnRST.addActionListener(this);		// 註冊整個視窗監聽
		frame.add(btnRST);
			
		frame.repaint(); 
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnRST) {
			txtID.setText("");
			pwfPWS.setText("");
			txtShow.setText("");
		}
			
		if (e.getSource() == btnOK) {
			String pws = new String(pwfPWS.getPassword());
			if (txtID.getText().equals("MOL") && pws.equals("89956000"))
				txtShow.setText("帳號密碼正確，歡迎光臨");
			else
				txtShow.setText("帳號密碼錯誤，請重新輸入");
		}
	}
}
public class Ch10_07
{
	public static void main(String[] args)
	{
		CLoginF loginF = new CLoginF();

	}

}
