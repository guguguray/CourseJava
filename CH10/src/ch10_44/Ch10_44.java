// choose file

package ch10_44;
import javax.swing.*;

class CFileChooserF
{
	CFileChooserF()
	{
		//建立Dialog
		JFileChooser chooser = new JFileChooser();
		
		// Show open dialog
		int f_open = chooser.showOpenDialog(null);
		
		// 按鈕判斷
		if (f_open == JFileChooser.APPROVE_OPTION )
		{
			String str = chooser.getSelectedFile().getPath();
			JOptionPane.showMessageDialog(null, "您選擇的檔案:\n"+ str);
		}
	}
}

public class Ch10_44
{

	public static void main(String[] args)
	{
		new CFileChooserF();

	}

}
