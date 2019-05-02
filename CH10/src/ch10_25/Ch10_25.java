// Border
package ch10_25;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class CTextAreaF extends JFrame
{
	CTextAreaF()
	{		
		JLabel lblPoetry =  new JLabel("黃鶴樓");
		add(lblPoetry);
		
		String st1 = "昔人已乘黃鶴去， 此地空餘黃鶴樓。\n";
		String st2 = "黃鶴一去不復返， 白雲千載空悠悠。\n";
		String st3 = "晴川歷歷漢陽樹， 芳草萋萋鸚鵡洲。 日暮鄉關何處是， 煙波江上使人愁。";
		
		JTextArea txtPoetry = new JTextArea(st1,4,22);
		txtPoetry.setBorder(BorderFactory.createLineBorder(Color.blue));
		txtPoetry.setLineWrap(true);
		txtPoetry.append(st2);
		txtPoetry.append(st3);
		add(txtPoetry);
		
		setTitle("多行文字欄位");
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
