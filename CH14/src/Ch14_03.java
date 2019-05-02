import javax.swing.*;

public class Ch14_03 extends JApplet
{
	public void init()
	{
		String pic_name = getParameter("param_pic");
		ImageIcon icon = new ImageIcon(getImage(getCodeBase(), pic_name));
		int num = Integer.parseInt(getParameter("param_num"));
		
		setLayout(null);
		
		JLabel lblPic[] = new JLabel[num];
		for (int i=0; i<num; i++) {
			lblPic[i] = new JLabel(icon);
			lblPic[i].setBounds(70*i, 10,70,50);
			add(lblPic[i]);
		}
		
		JLabel lblName = new JLabel();
		lblName.setText("¶ê§Î:"+ getParameter("param_chi"));
		lblName.setBounds(20, 100, 150, 20);
		add(lblName);
		
		JLabel lblNum = new JLabel();
		lblNum.setText("­Ó¼Æ:"+num);
		lblNum.setBounds(20, 120, 150, 20);
		add(lblNum);
		
	}
	
	
}
