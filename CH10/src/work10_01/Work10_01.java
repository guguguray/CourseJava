/* �n�J�e���s�@�m��
 * JFrame
 * 	JLabel
 * 	JTextfield
 * 	JPasswordfield
 * 	JButton
 */
package work10_01;

import javax.swing.*;

public class Work10_01
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("�n�J");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTit= new JLabel("��J�b���αK�X", SwingConstants.CENTER);
		lblTit.setBounds(0,20,260,30);
		frame.add(lblTit);
		
		JLabel lblAcc= new JLabel("�b��: ");
		lblAcc.setBounds(60,60,120,20);
		frame.add(lblAcc);
		
		JTextField txt = new JTextField();
		txt.setBounds(100,60,120,20);
		txt.setEditable(false);
		frame.add(txt);
		
		JLabel lblPwd= new JLabel("�K�X: ");
		lblPwd.setBounds(60,90,120,20);
		frame.add(lblPwd);
		
		JPasswordField pws = new JPasswordField();
		pws.setBounds(100, 90, 120, 20);
		pws.setEchoChar('*');
		frame.add(pws);	
		
		JTextField txt2 = new JTextField();
		txt2.setBounds(60,140,160,20);
		txt2.setEditable(false);
		frame.add(txt2);	
		
		JButton btnOK = new JButton("�T�w");
		btnOK.setBounds(60, 190, 60, 30);
		frame.add(btnOK);
		
		JButton btnRST = new JButton("����");
		btnRST.setBounds(160, 190, 60, 30);
		frame.add(btnRST);
		
		frame.repaint();
	}

}
