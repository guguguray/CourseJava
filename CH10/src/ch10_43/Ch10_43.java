package ch10_43;

import javax.swing.*;

class COptionDialogF
{
	COptionDialogF()
	{
		ImageIcon icon = new ImageIcon();
		
		String[] options = {"�q��", "���O", "���"};
		int ans = JOptionPane.showOptionDialog(null,  "�п���ʶR�ӫ~", "���", 
				0, 0, icon, options, options[0]);
		StringBuilder sbi = new StringBuilder("�z�ʶR���ӫ~�O: ");		
		
		if (ans == 0)
		{
			sbi = sbi.append(options[0]);
			JOptionPane.showMessageDialog(null,  sbi, "�T�{", 
					JOptionPane.INFORMATION_MESSAGE);	
		}
		else if (ans == 1)
		{
			sbi = sbi.append(options[1]);
			JOptionPane.showMessageDialog(null,  sbi, "�T�{", 
					JOptionPane.INFORMATION_MESSAGE);	
		}
		else
		{
			sbi = sbi.append(options[2]);
			JOptionPane.showMessageDialog(null,  sbi, "�T�{", 
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
