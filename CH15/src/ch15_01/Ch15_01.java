package ch15_01;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.sound.sampled.*;

class CClipF extends JFrame implements ActionListener
{
	private String file_name, r_ans;
	private Boolean is_play = false;
	
	private Clip playerSound;
	private JLabel lblAns = new JLabel("答:");
	private JLabel lblResult = new JLabel();
	private JTextField txtAns = new JTextField();
	private JButton btnOK = new JButton("確定");
	private JButton btnPlay= new JButton("英語單字");
	private JButton btnExit = new JButton("結束");
	
	CClipF() throws Exception 
	{
		lblAns.setBounds(20, 30, 30, 20);
		add(lblAns);
		
		txtAns.setBounds(60, 30, 100, 20);
		add(txtAns);
		
		btnOK.setBounds(180, 30, 80, 20);
		btnOK.addActionListener(this);
		add(btnOK);
		
		lblResult.setBounds(60, 60, 200, 20);
		add(lblResult);
		
		btnPlay.setBounds(60, 100, 100, 20);
		btnPlay.addActionListener(this);
		add(btnPlay);
		
		btnExit.setBounds(180, 100, 80, 20);
		btnExit.addActionListener(this);
		add(btnExit);
		
		r_ans = "dig";
		file_name = "..\\CH15\\src\\ch15_01\\"+r_ans+".wav";
		File filesound = new File(file_name);
		AudioInputStream sound = AudioSystem.getAudioInputStream(filesound);
		DataLine.Info infosound = new DataLine.Info(Clip.class, sound.getFormat());
		playerSound = (Clip) AudioSystem.getLine(infosound);
		playerSound.open(sound);
		
		setTitle("聽力測驗");
		setLayout(null);
		setBounds(100,100,300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit)
			System.exit(0);
		if (e.getSource() == btnPlay) {
			if (is_play)
				playerSound.loop(1);
			else
				playerSound.start();
			is_play = true;
		}
		if (e.getSource() == btnOK)
			if (txtAns.getText().toLowerCase().equals(r_ans))
				lblResult.setText("答對了");
			else
				lblResult.setText("答錯了!正確答案:"+ r_ans);					
	}
	
}
public class Ch15_01
{

	public static void main(String[] args) throws Exception
	{
		new CClipF();

	}

}
