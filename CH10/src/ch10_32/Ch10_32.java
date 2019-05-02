// �M��

package ch10_32;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import javax.swing.event.*;


class CListF extends JFrame implements ListSelectionListener
{
	private String[] place = {"�����s", "���s", "����", "�����s", "�ӥ��s", "�p�[�y"};
	private String[] city = {"�x�_", "�x��", "�n��", "�Ÿq", "�y��", "�̪F"};
	private JList<String> lstPlace = new JList<String>(place);
	private JTextArea txtPlaceCity = new JTextArea(3,3);
	
	public CListF()
	{
		JPanel pan = new JPanel();
		
		JLabel lblPlace = new JLabel("�����ϥN��: ");
		pan.add(lblPlace);
		
		JScrollPane spanPlace = new JScrollPane(lstPlace);
		pan.add(spanPlace);
		
		add(pan, BorderLayout.NORTH);
		
		lstPlace.setVisibleRowCount(4);
		lstPlace.addListSelectionListener(this);
		
		JScrollPane spanPlaceCity = new JScrollPane(txtPlaceCity);
		add(spanPlaceCity, BorderLayout.SOUTH);
		
		setTitle("�M��");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	public void valueChanged(ListSelectionEvent e)
	{
		List<String> values = lstPlace.getSelectedValuesList();
		int[] indices = lstPlace.getSelectedIndices();
		
		String place_city= "";
		int i = 0;
		for (String values_i:values)
		{
			place_city += values_i + ":" + city[indices[i]]+"\n";
			i++;
		}
		txtPlaceCity.setText(place_city);
		
	}
}
public class Ch10_32
{
	public static void main(String[] args)
	{
		new CListF();
	}
}
