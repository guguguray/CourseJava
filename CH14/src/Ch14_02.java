import java.awt.event.*;
import javax.swing.*;

public class Ch14_02 extends JApplet implements ActionListener
{
	private JLabel lblFah = new JLabel("�п�J�ؤ�ū�:");
	private JTextField txtFah = new JTextField();
	private JButton btnChange = new JButton("�ؤ������");
	private JLabel lblCel = new JLabel();
	
	public void init() {
		setLayout(null);
		
		lblFah.setBounds(20,10,110,20);
		add(lblFah);
		
		txtFah.setBounds(130, 10, 40, 20);
		add(txtFah);
		
		btnChange.setBounds(30, 50, 120, 20);
		add(btnChange);
		btnChange.addActionListener(this);
		
		lblCel.setBounds(20, 90, 140, 20);
		add(lblCel);
	}
	public void actionPerformed(ActionEvent e)
	{
		float f = Integer.parseInt(txtFah.getText());
		float c = (f-32)*5/9;
		
		lblCel.setText("���ū׬�:"+c);
	}

}
