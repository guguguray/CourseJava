
//Panel with CheckBox
package ch10_31;
import javax.swing.*;
import java.awt.*;

class CCheckF extends JFrame
{
	CCheckF()
	{
		JPanel pan =  new JPanel();
		add(pan);
		
		JLabel lblChkStyle =  new JLabel("�п�ܦr���˦�:");
		pan.add(lblChkStyle);
		
		JCheckBox[] chkStyle = new JCheckBox[3];
		chkStyle[0] = new JCheckBox("�a��", true);
		chkStyle[1] = new JCheckBox("�m��");
		chkStyle[2] = new JCheckBox("�a�k");
		for (int i=0; i<chkStyle.length; i++)
		{
			pan.add(chkStyle[i]);
		}
		
			
		setTitle("JCheckBox");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				
		repaint();
	}
}
public class Ch10_31
{

	public static void main(String[] args)
	{
		new CCheckF();

	}

}
