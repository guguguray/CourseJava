// choose file

package ch10_44;
import javax.swing.*;

class CFileChooserF
{
	CFileChooserF()
	{
		//�إ�Dialog
		JFileChooser chooser = new JFileChooser();
		
		// Show open dialog
		int f_open = chooser.showOpenDialog(null);
		
		// ���s�P�_
		if (f_open == JFileChooser.APPROVE_OPTION )
		{
			String str = chooser.getSelectedFile().getPath();
			JOptionPane.showMessageDialog(null, "�z��ܪ��ɮ�:\n"+ str);
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
