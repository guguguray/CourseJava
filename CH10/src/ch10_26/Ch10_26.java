package ch10_26;

import javax.swing.*;
import java.awt.*;

class CTabPaneF extends JFrame
{
	CTabPaneF()
	{
		JTabbedPane tpan = new JTabbedPane();
		tpan.setBounds(5,5,220,200);
		add(tpan);
				
		String st = "���b�� -- �� �ʼv\n" 
				+ "���H�w�����b�h�A ���a�žl���b�ӡC\n" 
				+ "���b�@�h���_��A �ն��d���űy�y�C\n" 
				+ "���t�����~����A �گ�ֵ��x�M�w�C \n" 
				+ "��Ƕm����B�O�A �Ϫi���W�ϤH�T�C";
		
		JTextArea txtPoetry = new JTextArea(st);		
		txtPoetry.setLineWrap(true);
		tpan.addTab("�C���߸�",txtPoetry);
		
		String tab_pic = "�Ӥ�";
		JLabel lblPic = new JLabel(new ImageIcon("..\\CH10\\src\\ch10_26\\images\\Yellow_Crane_Tower.jpg"));
		tpan.addTab(tab_pic, lblPic);
		
		setTitle("����");
		setLayout(null);
		setBounds(50,50,245,248);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				
		repaint();
	}
}
public class Ch10_26
{

	public static void main(String[] args)
	{
		new CTabPaneF();

	}

}
