package ch10_45;

import java.awt.*;
import javax.swing.*;

class CFileDialogF extends JFrame
{
	CFileDialogF()
	{
		//�إ�Dialog
		FileDialog fileDialog = new FileDialog(this, "�}���ɮ�", FileDialog.LOAD);
		fileDialog.setVisible(true);			
		
		String file_dir = fileDialog.getDirectory();
		String file_name = fileDialog.getFile();		
		
		
		// ���s�P�_
		if (file_name != null)
		{
			
			JOptionPane.showMessageDialog(null, "�z��ܪ��ɮ�:\n"+ file_dir + file_name);
			System.exit(0);
		}
		else
			System.exit(0);
	}
}

public class Ch10_45
{

	public static void main(String[] args)
	{
		new CFileDialogF();

	}

}
