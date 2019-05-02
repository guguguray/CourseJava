package ch10_45;

import java.awt.*;
import javax.swing.*;

class CFileDialogF extends JFrame
{
	CFileDialogF()
	{
		//建立Dialog
		FileDialog fileDialog = new FileDialog(this, "開啟檔案", FileDialog.LOAD);
		fileDialog.setVisible(true);			
		
		String file_dir = fileDialog.getDirectory();
		String file_name = fileDialog.getFile();		
		
		
		// 按鈕判斷
		if (file_name != null)
		{
			
			JOptionPane.showMessageDialog(null, "您選擇的檔案:\n"+ file_dir + file_name);
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
