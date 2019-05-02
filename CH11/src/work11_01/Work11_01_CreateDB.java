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
		JOptionPane.showMessageDialog(null, msg + "\n訊息:" + e, "錯誤訊息", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	public CCreate_DB_Tabel() {
		
		// 建立資料庫連接
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			ErrMsg("1.MYSQL 驅動程式安裝失敗!",e);
		}
		
		// 建立 Connection 物件 及 建立資料庫
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=wPress_05");
			stmt = conn.createStatement();
			String Create_DB = "CREATE DATABASE " + db_name;
			stmt.executeUpdate(Create_DB);
			
		} catch (SQLException e) {
			if (stmt != null) 
				ErrMsg("2."+ db_name +"資料庫已存在!", e);
			else
				ErrMsg("3.MySQL 無法啟動!",e );
		} catch (Exception e) {
			ErrMsg("4.發生其他錯誤!",e);
		}
		
		// 建立資料表
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=wPress_05");
			stmt = conn.createStatement();
			
			String Create_TB = "CREATE TABLE `" + db_table + "`";
			Create_TB += "(`Table` INT(2) NOT NULL COMMENT '桌次' , ";
			Create_TB += " `Main` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主餐' , ";
			Create_TB += " `Second1` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '副餐1' , ";
			Create_TB += " `Second2` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '副餐2' , ";
			Create_TB += " `Dessert` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '甜點' , ";
			Create_TB += " `Total` INT NOT NULL COMMENT '合計' ) ";
			
			
//			CREATE TABLE `mol`.`test` 
//			( `table_no` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '桌次' , 
//					`main_course` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '主餐' , 
//					`side1` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '副餐1' , 
//					`side2` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '副餐2' , 
//					`dessert` TEXT CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '甜點' , 
//					PRIMARY KEY (`table_no`(3))) ENGINE = InnoDB;
			stmt.executeUpdate(Create_TB);
			
			JOptionPane.showMessageDialog(null, "5." + db_name +"資料庫和" + db_table +"資料表建立成功!");
			stmt.close();
			System.exit(0);
			
		} catch (SQLException e) {
			if (stmt != null) 
				ErrMsg("6."+ db_table +"資料表已存在!", e);
			else
				ErrMsg("7.MySQL 無法啟動!",e );
		} catch (Exception e) {
			ErrMsg("8.發生其他錯誤!",e);
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
