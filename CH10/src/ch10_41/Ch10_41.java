// Dialog : YES / NO

package ch10_41;
import javax.swing.*;

class CConfirmDialogF
{
	CConfirmDialogF()
	{
		int ans = JOptionPane.showConfirmDialog(null,  "現在下雨嗎", "調查", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
	if (ans == JOptionPane.YES_OPTION)
		JOptionPane.showMessageDialog(null,  "請攜帶雨具", "提醒", 
				JOptionPane.INFORMATION_MESSAGE);	
	else
		JOptionPane.showMessageDialog(null,  "請做好防曬", "提醒", 
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
