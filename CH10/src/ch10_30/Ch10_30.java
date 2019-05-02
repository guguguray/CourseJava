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
		
		JLabel lblRdbAlign =  new JLabel("�п�ܹ��覡:");
		pan.add(lblRdbAlign);
		
		JRadioButton[] rdbAlign = new JRadioButton[3];
		rdbAlign[0] = new JRadioButton("�a��", true);
		rdbAlign[1] = new JRadioButton("�m��");
		rdbAlign[2] = new JRadioButton("�a�k");
		
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
