package work10_04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class CFoodF extends JFrame implements ActionListener
{	
	private JSpinner spinTable = new JSpinner();
	private JRadioButton[] rdbMain = new JRadioButton[4];
	private JCheckBox[] chkSecond = new JCheckBox[2];
	private JButton btnOK = new JButton("�T�w");
	private JTextArea txtInfo = new JTextArea();
	private String t_table = "�স:����", t_main = "�D�\:�A�N���� (200��)";
	private String t_second = "���\:����", t_dessert = "���I:����";
	private int m_main = 200, m_second = 0, m_total;
	
	
//	private String[] desert = {"�п��", "�k������", "�p���B�N�O", "�������", "�������~"};
//	private JComboBox<String> cboDesert = new JComboBox<String>(desert);
//	private JTextArea txtShow = new JTextArea("�I�\��T", 4, 80);
	
	CFoodF() 
	{	
		
		// �\�� Panel 
		JPanel panTable = new JPanel();
		panTable.setBounds(10, 10, 150, 60);
		panTable.setLayout(new FlowLayout(FlowLayout.LEFT));
		panTable.setBorder(BorderFactory.createTitledBorder("�y���T:"));
		add(panTable);
		
		JLabel lblTable = new JLabel("�স:");
		panTable.add(lblTable);
		
		spinTable = new JSpinner(new SpinnerNumberModel(0,0,30,1));
		spinTable.addChangeListener(ListTable);
		panTable.add(spinTable);
		
		btnOK.setBounds(220, 30, 70, 25);
		btnOK.addActionListener(ListOK);
		add(btnOK);
		
		// �D�\ Panel 
		JPanel panMain = new JPanel();
		panMain.setBounds(10, 80, 300, 80);
		panMain.setLayout(new GridLayout(2,2));
		panMain.setBorder(BorderFactory.createTitledBorder("�D�\"));
		add(panMain);
		
		rdbMain[0] = new JRadioButton("�A�N���� (200��)", true);
		rdbMain[1] = new JRadioButton("���p�� (300��)");
		rdbMain[2] = new JRadioButton("�K�N���� (250��)");	
		rdbMain[3] = new JRadioButton("�k���N�� (260��)");	
		
		ButtonGroup grpRdb = new ButtonGroup();
		for (int i=0; i<rdbMain.length; i++)
		{
			rdbMain[i].addActionListener(this);
			grpRdb.add(rdbMain[i]);
			panMain.add(rdbMain[i]);
		}
		
		// ���\ Panel 
		JPanel panSecond = new JPanel();
		panSecond.setBounds(10, 180, 150, 80);
		panSecond.setLayout(new GridLayout(2,1));
		panSecond.setBorder(BorderFactory.createTitledBorder("���\"));
		add(panSecond);
		
		String[] second_items = {"�A��Ī�� (80��)", "�������G (50��)"};
		for (int i=0; i < second_items.length; i++)
		{
			chkSecond[i] = new JCheckBox(second_items[i]);
			chkSecond[i].addItemListener(ListSecond);		
			panSecond.add(chkSecond[i]);
		}
		
		// ���I Panel
		
		JPanel panDessert = new JPanel();
		panDessert.setBounds(190, 180, 120, 60);
		panDessert.setBorder(BorderFactory.createTitledBorder("���I (�K�O)"));
		add(panDessert);
		
		String[] dessert_items = {"�п��", "�k������", "����B�N�O", "���¥��T"};
		JComboBox<String> cboDessert = new JComboBox<String>(dessert_items);
		cboDessert.addItemListener(ListDessert);
		panDessert.add(cboDessert); 
		
		JPanel panInfo = new JPanel();
		panInfo.setBounds(10, 280, 300, 120);
		panInfo.setBackground(Color.white);
		panInfo.setLayout(new FlowLayout(FlowLayout.LEFT));
		panInfo.setBorder(BorderFactory.createTitledBorder("�I�\��T:"));
		add(panInfo);
		
		txtInfo.setEditable(false);
		panInfo.add(txtInfo);
		
		
		setTitle("�I�\���");
		setLayout(null);
		setBounds(100, 100, 350, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
	}
	
	public ChangeListener ListTable = new ChangeListener()
	{
		public void stateChanged(ChangeEvent e)
		{
			if (spinTable.getValue() == "0")
				t_table = "�স:����";
			else
				t_table = "�স:��"+spinTable.getValue() + "��";
		}
	};
	
	public void actionPerformed(ActionEvent e)
	{
		t_main = "�D�\:" + ((JRadioButton) e.getSource()).getText();
		
		if (rdbMain[0].isSelected())
				m_main = 200;
		if (rdbMain[1].isSelected())
				m_main = 300;
		if (rdbMain[2].isSelected())
				m_main = 250;
		if (rdbMain[3].isSelected())
				m_main = 260;
	}
	public ItemListener ListSecond = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			t_second = "���\:";
			m_second = 0;
			
			if (chkSecond[0].isSelected())
			{
				t_second += "�A��Ī�� (80��)";
				m_second += 80;
			}
			if (chkSecond[1].isSelected())
			{
				t_second += "�������G (50��)";
				m_second += 50;
			}
			if (!chkSecond[0].isSelected() && !chkSecond[1].isSelected())
			{
				t_second += "����";
			}
		}
	};
	
	public ItemListener ListDessert = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			if (e.getItem().toString() == "�п��")
				t_dessert = "���I:����";
			else
				t_dessert = "���I:" + e.getItem().toString() + "(�K�O)";
		}
	};
	public ActionListener ListOK = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			m_total = m_main + m_second;
			txtInfo.setText(t_table+ "\n" + t_main + "\n" 
			+ t_second +"\n"+t_dessert + "\n"+"�X�p:"+ m_total+"��");
		}
	};
}

public class Work10_04
{

	public static void main(String[] args)
	{
		new CFoodF();

	}

}
