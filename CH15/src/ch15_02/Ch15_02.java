package ch15_02;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;;


class CNewAudioClipF extends JFrame implements ActionListener
{
	private String file_dir, file_name;
	private File file1;
	
	private FileDialog fileDialog1;
	private AudioClip playSound;
	
	private JButton btnOpen = new JButton("開啟檔案");
	private JButton btnPlay= new JButton("播放一次");
	private JButton btnLoop = new JButton("循環播放");
	private JButton btnStop = new JButton("停止播放");
	
	CNewAudioClipF()
	{
			
		btnOpen.setBounds(20, 20, 100, 20);
		btnOpen.addActionListener(this);
		add(btnOpen);
		
		btnStop.setBounds(140, 20, 100, 20);
		btnStop.setEnabled(false);
		btnStop.addActionListener(this);
		add(btnStop);
		
		btnPlay.setBounds(20, 70, 100, 20);
		btnPlay.setEnabled(false);
		btnPlay.addActionListener(this);
		add(btnPlay);
		
		btnLoop.setBounds(140, 70, 100, 20);
		btnLoop.setEnabled(false);
		btnLoop.addActionListener(this);
		add(btnLoop);
				
		setTitle("播放聲音檔");
		setLayout(null);
		setBounds(100,100,300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			fileDialog1 = new FileDialog(this, "開啟檔案", FileDialog.LOAD);
			fileDialog1.setVisible(true);
			file_dir = fileDialog1.getDirectory();
			file_name = fileDialog1.getFile();
			
			if (file_name == null) 
				return;
			file1 = new File(file_dir+file_name);
			
			try {
				playSound = Applet.newAudioClip(file1.toURL());
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex, "錯誤訊息", JOptionPane.ERROR_MESSAGE);
				
			}
			setTitle(file_name);
			btnOpen.setEnabled(false);
			btnStop.setEnabled(false);
			btnPlay.setEnabled(true);
			btnLoop.setEnabled(true);
			
			if (e.getSource() == btnStop) {
				setTitle("播放聲音檔");
				playSound.stop();
				btnOpen.setEnabled(true);
				btnStop.setEnabled(false);
				btnPlay.setEnabled(false);
				btnLoop.setEnabled(true);
			}
			
			if (e.getSource() == btnPlay) {
				btnStop.setEnabled(true);
				playSound.play();
			}
			
			if (e.getSource() == btnLoop) {
				btnStop.setEnabled(true);
				playSound.loop();
			}
		}
	}
	
}

public class Ch15_02
{

	public static void main(String[] args)
	{
		new CNewAudioClipF();

	}

}
