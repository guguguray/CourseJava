// Spinner

package ch10_34;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class CSpinnerF extends JFrame implements ChangeListener
{
	private JLabel lblTitle = new JLabel("選擇圖片:");
	private JLabel lblPic = new JLabel(new ImageIcon("..\\CH10\\src\\ch10_34\\images\\1.jpg"));
	private JSpinner spin = new JSpinner(new SpinnerNumberModel(1,1,5,1));
	private JPanel pan = new JPanel();
	
	CSpinnerF()
	{
		pan.setLayout(null);
		pan.setBackground(Color.pink);
		pan.setBounds(30, 30, 860, 670);
		add(pan);
		
		lblTitle.setBounds(30,10,100,20);
		pan.add(lblTitle);
		
		spin.setBounds(100,10,50,20);
		spin.addChangeListener(this);
		pan.add(spin);
		
		lblPic.setBounds(30,50,800,600);
		pan.add(lblPic);
		
		setTitle("圖片欣賞");
		setLayout(null);
		setBounds(50, 50, 940, 770);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	}
	public void stateChanged(ChangeEvent e)
	{
		String Pic_name = "..\\CH10\\src\\ch10_34\\images\\" + spin.getValue() + ".jpg";
		lblPic.setIcon(new ImageIcon(Pic_name));
	}
}
public class Ch10_34
{
	public static void main(String[] args)
	{
		new CSpinnerF();
	}
}
