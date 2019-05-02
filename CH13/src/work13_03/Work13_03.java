package work13_03;

import javax.swing.*;

class CMovePic implements Runnable
{
	private JLabel lblPic;
	private int end_x, pos_y, d_time;
	
	CMovePic(JLabel lblPic, int end_x, int pos_y, int d_time)
	{
		this.lblPic = lblPic;
		this.end_x = end_x;
		this.pos_y = pos_y;
		this.d_time = d_time;
	}
	public void run()
	{
		int pos_x = 0;
		while (true) {
			pos_x += 1;
			lblPic.setLocation(pos_x, pos_y);
			DelayTime(d_time);
			if (pos_x >= end_x)
				pos_x = -70;
		}
	}
	void DelayTime(int msec)
	{
		msec = (int)(msec * Math.random());
		try
		{
			Thread.sleep(msec);
		}
		catch (InterruptedException e) {
			
		}
	}
}

// first 建立一個視窗
class CMovePicF extends JFrame 
{
	private int e_x1, e_x2, e_x3, p_y1, p_y2, p_y3, d_time1, d_time2, d_time3;
	private JLabel lblPic1 = new JLabel(new ImageIcon("..\\CH13\\src\\work13_03\\images\\horse1.gif"));
	private JLabel lblPic2 = new JLabel(new ImageIcon("..\\CH13\\src\\work13_03\\images\\horse2.gif"));
	private JLabel lblPic3 = new JLabel(new ImageIcon("..\\CH13\\src\\work13_03\\images\\horse3.gif"));
	
	CMovePicF() {
		
		lblPic1.setSize(95, 95);
		add(lblPic1);
		
		lblPic2.setSize(95, 95);
		add(lblPic2);
		
		lblPic3.setSize(95, 95);
		add(lblPic3);
		
		e_x1 = 800;
		e_x2 = 800;
		e_x3 = 800;
		p_y1 = 20;
		p_y2 = 110;
		p_y3 = 200;
		
		d_time1 = (int)(Math.random()*100);
		d_time2 = (int)(Math.random()*100);
		d_time3 = (int)(Math.random()*100);
		
		Thread moviePic1 = new Thread(new CMovePic(lblPic1, e_x1, p_y1, d_time1));
		Thread moviePic2 = new Thread(new CMovePic(lblPic2, e_x2, p_y2, d_time2));
		Thread moviePic3 = new Thread(new CMovePic(lblPic3, e_x3, p_y3, d_time3));
		
		moviePic1.start();
		moviePic2.start();
		moviePic3.start();
		
		setTitle("賽馬");
		setLayout(null);
		setBounds(100, 100, 800, 360);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}

public class Work13_03
{

	public static void main(String[] args)
	{
		new CMovePicF();

	}

}
