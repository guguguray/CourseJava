import java.io.*;

public class WORK03_02_Q
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please Enter year: ");
		String st1 = keyin.readLine();
		int chkyear = Integer.parseInt(st1);	//輸入年份轉整數
	
		while ((chkyear <= 0) || (chkyear > 9999))
		{
			System.out.print("Please Enter year: ");
			st1 = keyin.readLine();
			chkyear = Integer.parseInt(st1);
		}
		
		char qurt = 'N';	//檢查閏年預設  no
		
		if (chkyear % 4 != 0)
			qurt = 'N';
		else if (chkyear % 100 == 0)
		{
			if (chkyear % 400 == 0)
				qurt = 'Y';
			else
				qurt = 'N';
		}
		else
			qurt = 'Y';

		
		System.out.println("input Year= " + chkyear + " 是否是閏年:" + qurt);
	}

}
