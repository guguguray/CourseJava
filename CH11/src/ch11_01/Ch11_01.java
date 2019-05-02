package ch11_01;

public class Ch11_01
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL驅動程是安裝成功!");
		}
		catch(Exception e)
		{
			System.out.println("MySQL驅動程是安裝失敗!");
		}
	}
}
