import java.awt.event.*;
import javax.swing.*;

public class Ch14_04B extends JApplet implements ActionListener
{
	String right_ans;
	private JTextField txtProb = new JTextField();
	private JTextField txtAns = new JTextField();
	private JTextArea txtResult = new JTextArea();
	private JButton btnOK = new JButton("確定");
	
	public void init()
	{
		setLayout(null);
		
		String title2 = getParameter("title2");
		JLabel lblTitle2 = new JLabel(title2);
		lblTitle2.setBounds(75, 10, 80, 20);
		add(lblTitle2);
		
		JLabel lblProb = new JLabel("題目:");
		lblProb.setBounds(15, 50, 50, 20);
		add(lblProb);
		
		txtProb.setBounds(65, 50, 100, 20);
		txtProb.setEditable(false);
		add(txtProb);
		
		JLabel lblAns = new JLabel("作答:");
		lblAns.setBounds(15, 80, 50, 20);
		add(lblAns);
		
		txtAns.setBounds(65, 80, 100, 20);
		add(txtAns);
		
		txtResult.setBounds(65, 110, 100, 40);
		txtResult.setEnabled(false);
		add(txtResult);
		
		
		btnOK.setBounds(50, 165, 80, 20);
		btnOK.addActionListener(this);
		add(btnOK);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnOK)
		{
			if (txtAns.getText().equals(right_ans))
				txtResult.setText("答對了!\n本提過關");
			else
				txtResult.setText("答錯了!\n正解:" +right_ans);
		}
	}

}
