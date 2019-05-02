package work11_02;

import java.sql.*;
import javax.swing.*;

class CCreate_DB_Tabel
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "MemberSystem";
	private String db_table = "Members";
	
	void ErrMsg (String msg, Exception e) {
		JOptionPane.showMessageDialog(null, msg + "\n�T��:" + e, "���~�T��", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	public CCreate_DB_Tabel() {
		
		// �إ߸�Ʈw�s��
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			ErrMsg("1.MYSQL �X�ʵ{���w�˥���!",e);
		}
		
		// �إ� Connection ���� �� �إ߸�Ʈw
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=test");
			stmt = conn.createStatement();
			String Create_DB = "CREATE DATABASE " + db_name;
			stmt.executeUpdate(Create_DB);
			
		} catch (SQLException e) {
			if (stmt != null) 
				ErrMsg("2."+ db_name +"��Ʈw�w�s�b!", e);
			else
				ErrMsg("3.MySQL �L�k�Ұ�!",e );
		} catch (Exception e) {
			ErrMsg("4.�o�ͨ�L���~!",e);
		}
		
		// �إ߸�ƪ�
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=test");
			stmt = conn.createStatement();
			
			String Create_TB = "CREATE TABLE `" + db_table + "`";
			Create_TB += "(`id` VARCHAR(10) NOT NULL COMMENT '�b��' , ";
			Create_TB += " `password` VARCHAR(10) NOT NULL COMMENT '�K�X' , ";
			Create_TB += " `name` VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '�m�W' , ";
			Create_TB += " `money` INT NOT NULL COMMENT '�뮽���B', ";
			Create_TB += "PRIMARY KEY (`id`(10))) ENGINE = InnoDB";				


			stmt.executeUpdate(Create_TB);
			
			JOptionPane.showMessageDialog(null, "5." + db_name +"��Ʈw�M" + db_table +"��ƪ��إߦ��\!");
			stmt.close();
			System.exit(0);
			
		} catch (SQLException e) {
			if (stmt != null) 
				ErrMsg("6."+ db_table +"��ƪ��w�s�b!", e);
			else
				ErrMsg("7.MySQL �L�k�Ұ�!",e );
		} catch (Exception e) {
			ErrMsg("8.�o�ͨ�L���~!",e);
		}
		
		
	}
}

public class Work11_02_CreateDB
{

	public static void main(String[] args)
	{
		new CCreate_DB_Tabel();

	}

}