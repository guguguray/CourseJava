package work11_01;

import java.sql.*;
import javax.swing.*;

class CCreate_DB_Tabel
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "OrderSystem";
	private String db_table = "Order";
	
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
		
		// �إ߸�ƪ�
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=wPress_05");
			stmt = conn.createStatement();
			
			String Create_TB = "CREATE TABLE `" + db_table + "`";
			Create_TB += "(`Table` INT(2) NOT NULL COMMENT '�স' , ";
			Create_TB += " `Main` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '�D�\' , ";
			Create_TB += " `Second1` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���\1' , ";
			Create_TB += " `Second2` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���\2' , ";
			Create_TB += " `Dessert` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���I' , ";
			Create_TB += " `Total` INT NOT NULL COMMENT '�X�p' ) ";
			
			
//			CREATE TABLE `mol`.`test` 
//			( `table_no` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '�স' , 
//					`main_course` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '�D�\' , 
//					`side1` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '���\1' , 
//					`side2` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '���\2' , 
//					`dessert` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '���I' , 
//					PRIMARY KEY (`table_no`(3))) ENGINE = InnoDB;
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

public class Work11_01_CreateDB
{

	public static void main(String[] args)
	{
		new CCreate_DB_Tabel();

	}

}
