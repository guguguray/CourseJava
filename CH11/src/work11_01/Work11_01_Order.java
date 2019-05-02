package work11_01;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;


class CFoodF extends JFrame implements ActionListener
{		
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String db_name = "ordersystem";
	private String db_table = "order";
	
	private JSpinner spinTable = new JSpinner();
	private JRadioButton[] rdbMain = new JRadioButton[4];
	private JCheckBox[] chkSecond = new JCheckBox[2];
	private JButton btnOK = new JButton("�T�w");
	private JTextArea txtInfo = new JTextArea();
	private String t_table = "�স:����", t_main = "�D�\:�A�N���� (200��)";
	private String t_second = "���\:����", t_dessert = "���I:����";
	private String d_main = "�A�N���ơ]200���^", d_second1 = "", d_second2 = "", d_dessert = "";
	private int d_table = 0, m_main = 200, m_second = 0, m_total = 0;
	
	
//	private String[] desert = {"�п��", "�k������", "�p���B�N�O", "�������", "�������~"};
//	private JComboBox<String> cboDesert = new JComboBox<String>(desert);
//	private JTextArea txtShow = new JTextArea("�I�\��T", 4, 80);
	
	CFoodF() 
	{	
		CheckDB();
		
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
			{
				t_table = "�স:��"+spinTable.getValue() + "��";
				d_table = (int)spinTable.getValue();
			}			
		}
	};
	
	public void actionPerformed(ActionEvent e)
	{
		t_main = "�D�\:" + ((JRadioButton) e.getSource()).getText();
		d_main = ((JRadioButton) e.getSource()).getText();
		
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
			d_second1 = "";
			d_second2 = "";
			m_second = 0;
			
			if (chkSecond[0].isSelected())
			{
				t_second += "�A��Ī�� (80��)";
				d_second1 = "�A��Ī�� (80��)";
				m_second += 80;
			}
			if (chkSecond[1].isSelected())
			{
				t_second += "�������G (50��)";
				d_second2 = "�������G (50��)";
				m_second += 50;
			}
			if (!chkSecond[0].isSelected() && !chkSecond[1].isSelected())
			{
				t_second += "����";
				d_second1 = "";
				d_second2 = "";
			}
		}
	};
	
	public ItemListener ListDessert = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			if (e.getItem().toString() == "�п��")
			{
				t_dessert = "���I:����";
				d_dessert = "";
			}
				
			else 
			{
				t_dessert = "���I:" + e.getItem().toString() + "(�K�O)";
				d_dessert = e.getItem().toString();
			}				
		}
	};
	public ActionListener ListOK = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			if (t_table == "�স:����")
				JOptionPane.showMessageDialog(null, "����y�স�z", "���~�T��", JOptionPane.ERROR_MESSAGE);
			else {
				m_total = m_main + m_second;
				txtInfo.setText(t_table+ "\n" + t_main + "\n" + t_second +"\n"+t_dessert + "\n"+"�X�p:"+ m_total+"��");
				
				InsertDB(d_table, d_main, d_second1, d_second2, d_dessert, m_total);
			}
			
		}
	};
	
	void CheckDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch (Exception e)
		{
			ErrDBMsg("1�B�X�ʵ{���w�˥��ѡI", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=wPress_05");
		}
		catch (SQLException e)
		{
			ErrDBMsg("2�BMySQL�L�k�ҰʡI", e);
		}
	}
	
	void InsertDB(int d_table, String d_main, String d_second1, String d_second2, String d_dessert, int m_total)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.execute(
					"INSERT `" + db_table + "` (`Table`, `Main`, `Second1`, `Second2`, `Dessert`, `Total`) VALUES(' "
							+ d_table + " ' , ' " + d_main + " ' , ' " + d_second1 + " ' , ' " + d_second2 + " ',' "
							+ d_dessert + " ' , ' " + m_total + " ' )");
		}
		catch (SQLException e)
		{
			ErrDBMsg("3�B�s�W�I�\��Ʋ��ͪ����~�I", e);
		}
		finally
		{
			FileClose();
		}
	}

	void FileClose()
	{
		if (rs != null)
		{
			try
			{
				rs.close();
			}
			catch (SQLException e)
			{
				ErrDBMsg("4�B������Ʈw���ͪ����~�I", e);
			}

			rs = null;
		}

		if (stmt != null)
		{
			try
			{
				stmt.close();
			}
			catch (SQLException e)
			{
				ErrDBMsg("5�B������Ʈw���ͪ����~�I", e);
			}

			stmt = null;
		}
	}

	void ErrDBMsg(String msg, Exception e)
	{
		JOptionPane.showMessageDialog(null, msg + "\n�T���G" + e, "���~�T��", JOptionPane.ERROR_MESSAGE);

		System.exit(0);
	}
	
	
}

public class Work11_01_Order
{

	public static void main(String[] args)
	{
		new CFoodF();

	}

}
