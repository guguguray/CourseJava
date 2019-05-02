import java.awt.event.*;
import javax.swing.*;

public class Work14_01 extends JApplet implements ActionListener
{
	String right_ans;
	private JTextField txtTmpc = new JTextField();
	private JTextField txtTmpf = new JTextField();
	
	private JButton btnTmpc = new JButton("華氏轉攝氏");
	private JButton btnTmpf = new JButton("攝氏轉華氏");
	
	private JTextField txtRdesultc = new JTextField();
	private JTextField txtRdesultf = new JTextField();
	
	public void init()
	{
		setLayout(null);
		
		String title1 = getParameter("綜合練習1");
		JLabel lblTitle1 = new JLabel(title1);
		lblTitle1.setBounds(75, 10, 80, 20);
		add(lblTitle1);
		
		
		JLabel lbltmpc = new JLabel("請輸入華氏溫度:");
		lbltmpc.setBounds(15, 10, 150, 20);
		add(lbltmpc);
		
		txtTmpc.setBounds(120, 10, 40, 20);
		add(txtTmpc);
		
		btnTmpc.setBounds(30, 40, 120, 20);
		btnTmpc.addActionListener(this);
		add(btnTmpc);
		
		txtRdesultc.setBounds(30, 70, 120, 20);
		txtRdesultc.setEditable(false);
		add(txtRdesultc);
		
		
		JLabel lbltmpf = new JLabel("請輸入攝氏溫度:");
		lbltmpf.setBounds(15, 110, 150, 20);
		add(lbltmpf);
		
		txtTmpf.setBounds(120, 110, 40, 20);
		txtTmpf.addActionListener(this);
		add(txtTmpf);
		
		btnTmpf.setBounds(30, 140, 120, 20);
		btnTmpf.addActionListener(this);
		add(btnTmpf);
		
		txtRdesultf.setBounds(30, 170, 120, 20);
		txtRdesultf.setEditable(false);
		add(txtRdesultf);		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int xc, xf;
		
		if (e.getSource() == btnTmpc)
		{
			xf = Integer.parseInt(txtTmpc.getText());
			xc = (xf-32)*5/9;
			txtRdesultc.setText(String.valueOf(xc));;
		}
		if (e.getSource() == btnTmpf)
		{
			xc = Integer.parseInt(txtTmpf.getText());
			xf = xc * 9 / 5+32;
			txtRdesultf.setText(String.valueOf(xf));
		}
	}
	
}
