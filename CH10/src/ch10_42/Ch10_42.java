package ch10_42;

import javax.swing.*;

class CInputDialogF
{
	CInputDialogF()
	{
		Object[] possibleValues = {"�x�_", "�x��", "����"};
		Object selectedValue = JOptionPane.showInputDialog(null,  "�п�ܮȹC�a�I", "��J", 
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		if (selectedValue == null)
			System.exit(0);
		else
		{
			int scd = JOptionPane.showConfirmDialog(null,  selectedValue, "��J���G", 
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			if (scd == JOptionPane.NO_OPTION)
				System.exit(0);
			else
			{
				String ans = JOptionPane.showInputDialog(null, "�п�J�ȹC�H��", "2");
				if (ans == null)
					System.exit(0);
				else
				{
					StringBuilder sbi = new StringBuilder("�P�±z�@��");
					sbi = sbi.append(ans);
					sbi = sbi.append(" �H�ѥ[ ");
					sbi = sbi.append(selectedValue);
					sbi = sbi.append(" �ȹC�C");
					
					JOptionPane.showMessageDialog(null, sbi, "�P��", JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		}		
	}
}

public class Ch10_42
{

	public static void main(String[] args)
	{
		new CInputDialogF();

	}

}
