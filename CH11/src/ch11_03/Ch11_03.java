/*
 * DB insert / query / Delete
 */

package ch11_03;
import java.sql.*;
import java.io.*;
import java.text.*;

import javax.swing.JOptionPane;
                                                                                                                                                                                                                                                                                                                                                               
class CStockOperation
{
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String db_name, db_table;	
	
	public CStockOperation(String db_name, String db_table) {
		
		this.db_name = db_name;
		this.db_table = db_table;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("1.MYSQL �X�ʵ{���w�˥���!\n");
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/"+ db_name +"?user=root&password=wPress_05");
			
		} catch (SQLException e) {
			System.out.println("2. Connection ���~!\n");
		} 		
	}
	
	public void InsertDB(String v_code, String v_name, float v_price, int v_amount) 
	{
		try {			
			stmt = conn.createStatement();			
			stmt.execute("INSERT INTO "+ db_table + "(code, name, price, amount) VALUES ('" + v_code +"','" + v_name 
					+"'," + v_price + ", " + v_amount + ")");			
		} catch (SQLException e) {
			System.out.println("3.���J��ƿ��~!\n");
			
		} finally {
			FileClose();
		}
	}
	
	public void DeleteDB(String search_code) 
	{
		try {			
			stmt = conn.createStatement();			
			stmt.executeUpdate("DELETE FROM "+ db_table + " WHERE code ='" + search_code + "'");			
		} catch (SQLException e) {
			System.out.println("4.�R����ƿ��~!\n");
			
		} finally {
			FileClose();
		}
	}
	
	public void Displey() 
	{
		float money, total = 0;
		Format nf = new DecimalFormat(",###.0");
		
		try {			
			stmt = conn.createStatement();	
			rs = stmt.executeQuery("SELECT * FROM "+ db_table);
			
			while (rs.next())
			{
				System.out.print(rs.getString("code")+ "\t\t" + rs.getString("name") + "\t\t" + rs.getFloat("price") + "\t\t" + rs.getInt("amount"));
				money = rs.getFloat("price") * rs.getInt("amount");
				System.out.println("\t\t" + nf.format(money));
				total += money;				
			}
			System.out.println("\n�`���B\t\t" + nf.format(total));				
		} catch (SQLException e) {
			System.out.println("5.�d�߸�ƿ��~!\n");
			
		} finally {
			FileClose();
		}
	}
	void FileClose() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("6.��Ʈw�������~!\n");
			}
			rs = null;
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("7.��Ʈw�������~!\n");
			}
			stmt = null;
		}	
	}	
}

public class Ch11_03
{

	public static void main(String[] args) throws IOException
	{
		String db_name = "mol";
		String db_table = "stock";
		
		CStockOperation CStOp = new CStockOperation(db_name, db_table);
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1.�s�W\t2.�������~\t3.�R��\t4.����:");
			int choice = Integer.parseInt(keyin.readLine());
			System.out.println("=======================================");
			
			switch (choice)
			{
			case 1:
				System.out.println("1.�s�W���~");
				System.out.println("��J���~�N�X:");
				String v_code = keyin.readLine();
				System.out.println("��J���~�W��:");
				String v_name = keyin.readLine();
				System.out.println("��J���~���:");
				float v_price = Float.parseFloat(keyin.readLine());
				System.out.println("��J���~�ƶq:");
				int v_amount = Integer.parseInt(keyin.readLine());
				CStOp.InsertDB(v_code, v_name, v_price, v_amount);
				break;
			case 2:
				System.out.println("2.�������~���");
				System.out.println("\n���~�N�X\t\t���~�W��\t\t���\t\t�ƶq\t\t���B");
				CStOp.Displey();
				break;
			case 3:
				System.out.println("3.�R�����~");
				System.out.println("��J���~�N�X:");
				String search_code = keyin.readLine();
				CStOp.DeleteDB(search_code);
				break;
			case 4:
				System.exit(0);
			}
		}

	}

}
