/*
 * �q���C��
 */
package work10_02;

import javax.swing.*;
class CGameF extends JFrame {
	
}
public class Work10_02
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("�q���C��");
		frame.setLayout(null);
		frame.setBounds(100, 100, 400, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUser= new JLabel("�ХX��...");
		lblUser.setBounds(20,20,200,20);
		frame.add(lblUser);
		
		JLabel lblCom= new JLabel("�ݽ֥�Ĺ����!!");
		lblCom.setBounds(140,20,200,20);
		frame.add(lblCom);
		
		// Layout Left Side: Action Button
		JButton btnSci = new JButton ("�ŤM");
		btnSci.setBounds(20,80,60,20);
		frame.add(btnSci);
		
		JButton btnStone = new JButton ("���Y");
		btnStone.setBounds(20,120,60,20);
		frame.add(btnStone);
		
		JButton btnPaper = new JButton ("��");
		btnPaper.setBounds(20,160,60,20);
		frame.add(btnPaper);
		
		JButton btnCls = new JButton ("�M��");
		btnCls.setBounds(20,200,60,20);
		frame.add(btnCls);
		
		// Layout Right Side: Calc Result
		JLabel lblWin= new JLabel("���aĹ����: 0");
		lblWin.setBounds(130,90,200,20);
		frame.add(lblWin);
		
		JLabel lblLos= new JLabel("�q��Ĺ����: 0");
		lblLos.setBounds(130,110,200,20);
		frame.add(lblLos);
		
		JLabel lblEqu= new JLabel("���⦸��: 0");
		lblEqu.setBounds(130,140,200,20);
		frame.add(lblEqu);
		
		JLabel lblStat= new JLabel("��Ĺ���A: ");
		lblStat.setBounds(130,200,200,20);
		frame.add(lblStat);
		
		
		ImageIcon icon = new ImageIcon("..\\CH10\\src\\ch10_06\\images\\Horse.gif");
		frame.repaint();
	}

}
