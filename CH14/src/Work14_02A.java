import java.awt.event.*;
import javax.swing.*;

public class Work14_02A extends JApplet implements ActionListener
{
	private Work14_02B applet1;
	private JTextField txtGuessA, txtGuessB;
	private JButton btnSend = new JButton("�ǰe");
	private JLabel lblHead, lblHint, lblsideA, lblsideB;
	
	public void init()
	{
		setLayout(null);
		
		String title1 = getParameter("��X�m��2");
		JLabel lblTitle1 = new JLabel(title1);
		lblTitle1.setBounds(75, 10, 80, 20);
		add(lblTitle1);
		
		
		lblHead = new JLabel("�Ҥ�");
		lblHead.setBounds(15, 10, 150, 20);
		add(lblHead);
		
		lblHead = new JLabel("1.�ŤM  2.���Y  3.��");
		lblHead.setBounds(15, 30, 150, 20);
		add(lblHead);
		
		lblsideA = new JLabel("�Ҥ�X��:");
		lblsideA.setBounds(30, 50, 150, 20);
		add(lblsideA);
		
		txtGuessA = new JTextField();
		txtGuessA.setBounds(120, 50, 40, 20);
		add(txtGuessA);
		
		lblsideB = new JLabel("�A��X��:");
		lblsideB.setBounds(30, 80, 150, 20);
		add(lblsideB);
		
		txtGuessB = new JTextField();
		txtGuessB.setBounds(120, 80, 40, 20);
		add(txtGuessB);		
		
	}
}
