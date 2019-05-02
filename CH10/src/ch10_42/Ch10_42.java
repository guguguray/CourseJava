package ch10_42;

import javax.swing.*;

class CInputDialogF
{
	CInputDialogF()
	{
		Object[] possibleValues = {"台北", "台中", "高雄"};
		Object selectedValue = JOptionPane.showInputDialog(null,  "請選擇旅遊地點", "輸入", 
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		if (selectedValue == null)
			System.exit(0);
		else
		{
			int scd = JOptionPane.showConfirmDialog(null,  selectedValue, "輸入結果", 
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			
			if (scd == JOptionPane.NO_OPTION)
				System.exit(0);
			else
			{
				String ans = JOptionPane.showInputDialog(null, "請輸入旅遊人數", "2");
				if (ans == null)
					System.exit(0);
				else
				{
					StringBuilder sbi = new StringBuilder("感謝您一行");
					sbi = sbi.append(ans);
					sbi = sbi.append(" 人參加 ");
					sbi = sbi.append(selectedValue);
					sbi = sbi.append(" 旅遊。");
					
					JOptionPane.showMessageDialog(null, sbi, "感謝", JOptionPane.INFORMATION_MESSAGE);
					
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
