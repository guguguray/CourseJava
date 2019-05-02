// Border
package ch10_25;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class CTextAreaF extends JFrame
{
	CTextAreaF()
	{		
		JLabel lblPoetry =  new JLabel("���b��");
		add(lblPoetry);
		
		String st1 = "���H�w�����b�h�A ���a�žl���b�ӡC\n";
		String st2 = "���b�@�h���_��A �ն��d���űy�y�C\n";
		String st3 = "���t�����~����A �گ�ֵ��x�M�w�C ��Ƕm����B�O�A �Ϫi���W�ϤH�T�C";
		
		JTextArea txtPoetry = new JTextArea(st1,4,22);
		txtPoetry.setBorder(BorderFactory.createLineBorder(Color.blue));
		txtPoetry.setLineWrap(true);
		txtPoetry.append(st2);
		txtPoetry.append(st3);
		add(txtPoetry);
		
		setTitle("�h���r���");
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				
		repaint();
	}
}

public class Ch10_25
{
	public static void main(String[] args)
	{
		new CTextAreaF();

	}
}
