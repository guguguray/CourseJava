// Dialog : YES / NO

package ch10_41;
import javax.swing.*;

class CConfirmDialogF
{
	CConfirmDialogF()
	{
		int ans = JOptionPane.showConfirmDialog(null,  "�{�b�U�B��", "�լd", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
	if (ans == JOptionPane.YES_OPTION)
		JOptionPane.showMessageDialog(null,  "����a�B��", "����", 
				JOptionPane.INFORMATION_MESSAGE);	
	else
		JOptionPane.showMessageDialog(null,  "�а��n����", "����", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
public class Ch10_41
{

	public static void main(String[] args)
	{
		new CConfirmDialogF();

	}

}
