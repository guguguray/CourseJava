//RadioButton 
//RadioGroup

// Panel with RadioButton

package ch10_30;
import javax.swing.*;
import java.awt.*;


class CRadioF extends JFrame
{
	CRadioF()
	{
		JPanel pan =  new JPanel();
		add(pan);
		
		JLabel lblRdbAlign =  new JLabel("請選擇對其方式:");
		pan.add(lblRdbAlign);
		
		JRadioButton[] rdbAlign = new JRadioButton[3];
		rdbAlign[0] = new JRadioButton("靠左", true);
		rdbAlign[1] = new JRadioButton("置中");
		rdbAlign[2] = new JRadioButton("靠右");
		
		ButtonGroup grpRdb = new ButtonGroup();
		for (int i=0; i<rdbAlign.length; i++)
		{
			grpRdb.add(rdbAlign[i]);
			pan.add(rdbAlign[i]);
		}
		
			
		setTitle("JRadioButton");
		pack();
		setLocation(50,50);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				
		repaint();
	}
}

public class Ch10_30
{

	public static void main(String[] args)
	{
		new CRadioF();

	}

}
