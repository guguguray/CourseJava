/*
 * 猜拳遊戲
 */
package work10_02;

import javax.swing.*;
class CGameF extends JFrame {
	
}
public class Work10_02
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("猜拳遊戲");
		frame.setLayout(null);
		frame.setBounds(100, 100, 400, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUser= new JLabel("請出拳...");
		lblUser.setBounds(20,20,200,20);
		frame.add(lblUser);
		
		JLabel lblCom= new JLabel("看誰先贏五次!!");
		lblCom.setBounds(140,20,200,20);
		frame.add(lblCom);
		
		// Layout Left Side: Action Button
		JButton btnSci = new JButton ("剪刀");
		btnSci.setBounds(20,80,60,20);
		frame.add(btnSci);
		
		JButton btnStone = new JButton ("石頭");
		btnStone.setBounds(20,120,60,20);
		frame.add(btnStone);
		
		JButton btnPaper = new JButton ("布");
		btnPaper.setBounds(20,160,60,20);
		frame.add(btnPaper);
		
		JButton btnCls = new JButton ("清除");
		btnCls.setBounds(20,200,60,20);
		frame.add(btnCls);
		
		// Layout Right Side: Calc Result
		JLabel lblWin= new JLabel("玩家贏次數: 0");
		lblWin.setBounds(130,90,200,20);
		frame.add(lblWin);
		
		JLabel lblLos= new JLabel("電腦贏次數: 0");
		lblLos.setBounds(130,110,200,20);
		frame.add(lblLos);
		
		JLabel lblEqu= new JLabel("平手次數: 0");
		lblEqu.setBounds(130,140,200,20);
		frame.add(lblEqu);
		
		JLabel lblStat= new JLabel("輸贏狀態: ");
		lblStat.setBounds(130,200,200,20);
		frame.add(lblStat);
		
		
		ImageIcon icon = new ImageIcon("..\\CH10\\src\\ch10_06\\images\\Horse.gif");
		frame.repaint();
	}

}
