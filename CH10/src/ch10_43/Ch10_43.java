package ch10_43;

import javax.swing.*;

class COptionDialogF
{
	COptionDialogF()
	{
		ImageIcon icon = new ImageIcon();
		
		String[] options = {"電腦", "平板", "手機"};
		int ans = JOptionPane.showOptionDialog(null,  "請選擇購買商品", "選擇", 
				0, 0, icon, options, options[0]);
		StringBuilder sbi = new StringBuilder("您購買的商品是: ");		
		
		if (ans == 0)
		{
			sbi = sbi.append(options[0]);
			JOptionPane.showMessageDialog(null,  sbi, "確認", 
					JOptionPane.INFORMATION_MESSAGE);	
		}
		else if (ans == 1)
		{
			sbi = sbi.append(options[1]);
			JOptionPane.showMessageDialog(null,  sbi, "確認", 
					JOptionPane.INFORMATION_MESSAGE);	
		}
		else
		{
			sbi = sbi.append(options[2]);
			JOptionPane.showMessageDialog(null,  sbi, "確認", 
					JOptionPane.INFORMATION_MESSAGE);	
		}	
	}
}

public class Ch10_43
{
	public static void main(String[] args)
	{
		new COptionDialogF();
	}
}
