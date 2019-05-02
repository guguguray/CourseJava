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
				
		String st = "黃鶴樓 -- 唐 催影\n" 
				+ "昔人已乘黃鶴去， 此地空餘黃鶴樓。\n" 
				+ "黃鶴一去不復返， 白雲千載空悠悠。\n" 
				+ "晴川歷歷漢陽樹， 芳草萋萋鸚鵡洲。 \n" 
				+ "日暮鄉關何處是， 煙波江上使人愁。";
		
		JTextArea txtPoetry = new JTextArea(st);		
		txtPoetry.setLineWrap(true);
		tpan.addTab("七言律詩",txtPoetry);
		
		String tab_pic = "照片";
		JLabel lblPic = new JLabel(new ImageIcon("..\\CH10\\src\\ch10_26\\images\\Yellow_Crane_Tower.jpg"));
		tpan.addTab(tab_pic, lblPic);
		
		setTitle("頁籤");
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
