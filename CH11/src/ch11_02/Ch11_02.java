package ch11_02;
import java.sql.*;
import javax.swing.*;
class CCreate_DB_Tabel
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "mol";
	private String db_table = "stock";
	
	void ErrMsg (String msg, Exception e) {
		JOptionPane.showMessageDialog(null, msg + "\n�T��:" + e, "���~�T��", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	public CCreate_DB_Tabel() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			ErrMsg("1.MYSQL �X�ʵ{���w�˥���!",e);
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=wPress_05");
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
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=wPress_05");
			stmt = conn.createStatement();
			
			String Create_TB = "CREATE TABLE " + db_table;
			Create_TB += "(code TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���~�N�X', ";
			Create_TB += "name TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���~�W��', ";
			Create_TB += "price FLOAT NOT NULL COMMENT '���', ";
			Create_TB += "amount INT NOT NULL COMMENT '�ƶq', ";
			Create_TB += "PRIMARY KEY (code(5))) ENGINE = InnoDB";			
			stmt.executeUpdate(Create_TB);
			
			JOptionPane.showMessageDialog(null, "5." + db_name +"��Ʈw�M" + db_table +"��ƪ�إߦ��\!");
			stmt.close();
			System.exit(0);
			
		} catch (SQLException e) {
			if (stmt != null) 
				ErrMsg("6."+ db_table +"��ƪ�w�s�b!", e);
			else
				ErrMsg("7.MySQL �L�k�Ұ�!",e );
		} catch (Exception e) {
			ErrMsg("8.�o�ͨ�L���~!",e);
		}
		
		
	}
}
public class Ch11_02
{

	public static void main(String[] args)
	{
		new CCreate_DB_Tabel();

	}

}
