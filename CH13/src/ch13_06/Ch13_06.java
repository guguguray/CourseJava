package ch13_06;

import java.awt.event.*;
import javax.swing.*;


class CTimerF extends JFrame implements ActionListener
{
	private int hour, minute, second;
	private long conti_time, tot_time = 0;
	private boolean is_start = true, is_pause, is_showtime;
	private Timer timer = new Timer(1000, this);
	private JLabel lblTimer = new JLabel("0��:0��:0��");
	private JButton btnStart = new JButton("�}�l");
	private JButton btnReset = new JButton("�k�s");
		
	public CTimerF()
	{
		lblTimer.setBounds(50, 10, 150, 20);
		add (lblTimer);
		
		btnStart.setBounds(20, 40, 60, 20);
		add(btnStart);
		btnStart.addActionListener(this);
		
		btnReset.setBounds(100, 40, 60, 20);
		add(btnReset);
		btnReset.addActionListener(this);
		
		setTitle("�O�ɾ�");
		setLayout(null);
		setBounds(100,100,200,110);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
public class Ch13_06
{

	public static void main(String[] args)
	{
		new CTimerF();

	}

}
