import java.awt.event.*;
import javax.swing.*;

public class Ch14_04A extends JApplet implements ActionListener
{
	private Ch14_04B applet1;
	private JTextField txtProb = new JTextField();
	private JTextField txtRightAns = new JTextField();
	private JButton btnSend = new JButton("傳送");
	
	public void init()
	{
		setLayout(null);
		String title1 = getParameter("title1");
		JLabel lblTitle1 = new JLabel(title1);
		lblTitle1.setBounds(75, 10, 80, 20);
		add(lblTitle1);
		
		JLabel lblProb = new JLabel("題目:");
		lblProb.setBounds(15, 50, 50, 20);
		add(lblProb);
		
		txtProb.setBounds(65, 50, 100, 20);
		add(txtProb);
		
		JLabel lblRightAns = new JLabel("正解:");
		lblRightAns.setBounds(15, 80, 50, 20);
		add(lblRightAns);
		
		txtRightAns.setBounds(65, 80, 100, 20);
		add(txtRightAns);
		
		btnSend.setBounds(50, 165, 80, 20);
		btnSend.addActionListener(this);
		add(btnSend);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnSend)
		{
			applet1 = (Ch14_04B) getAppletContext().getApplet("student");
			applet1.txtProb.setText(txtProb.getText());
			applet1.right_ans = txtRightAns.getText();
			applet1.txtAns.setText("");
			applet1.txtResult.setText("");
		}
	}

}
