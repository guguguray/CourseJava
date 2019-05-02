// insert data into Array with decending order
import java.io.*;
import java.util.Arrays;

public class WORK04_03
{

	public static void main(String[] args) throws IOException
	{
		int[] oldList = new int[]{75, 24, 98, 76, 55, 13};
		int[] newList;
		int NoAdd;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入想要新增的筆數: ");
		String strNoAdd = keyin.readLine();
		NoAdd  = Integer.parseInt(strNoAdd);
		newList = new int[oldList.length+NoAdd];
		System.out.println(oldList.length);
		
		
		for (int i=0; i<NoAdd; i++)
		{
			System.out.println("請輸入第 " + (i+1) + " 筆數字: ");
			String strEnterNum = keyin.readLine();
			int enterNum = Integer.parseInt(strEnterNum);

			
		}
		

	}

}
