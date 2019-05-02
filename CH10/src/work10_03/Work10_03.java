// panel with radio button
package work10_03;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

class MyJPanel extends JFrame
{
	MyJPanel()
	{
		setTitle("格式化");
		setLayout(null);
		setBounds(100, 100, 300, 280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		pan.setBounds(20, 40, 100, 150);
		
		Border lineB = BorderFactory.createLineBorder(Color.black);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "對齊"));
		add(pan);
		
		JRadioButton[] rdbAlign = new JRadioButton[3];
		rdbAlign[0] = new JRadioButton("靠左", true);
		rdbAlign[1] = new JRadioButton("置中");
		rdbAlign[2] = new JRadioButton("靠右");		
		
		for (int i=0; i<rdbAlign.length; i++)
		{
			pan.add(rdbAlign[i]);
		}
		
		JPanel pan2 = new JPanel();
		pan2.setBounds(150, 40, 100, 150);
		
		Border lineA = BorderFactory.createLineBorder(Color.black);
		pan2.setBorder(BorderFactory.createTitledBorder(lineA, "樣式"));
		add(pan2);
		
		JRadioButton[] rdbAlign2 = new JRadioButton[3];
		rdbAlign2[0] = new JRadioButton("靠左", true);
		rdbAlign2[1] = new JRadioButton("置中");
		rdbAlign2[2] = new JRadioButton("靠右");		
		
		for (int i=0; i<rdbAlign2.length; i++)
		{
			pan2.add(rdbAlign2[i]);
		}
		
		repaint();
	}
}


public class Work10_03
{

	public static void main(String[] args)
	{
		new MyJPanel();

	}

}
