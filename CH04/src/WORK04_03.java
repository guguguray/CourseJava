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
		
		System.out.println("�п�J�Q�n�s�W������: ");
		String strNoAdd = keyin.readLine();
		NoAdd  = Integer.parseInt(strNoAdd);
		newList = new int[oldList.length+NoAdd];
		System.out.println(oldList.length);
		
		
		for (int i=0; i<NoAdd; i++)
		{
			System.out.println("�п�J�� " + (i+1) + " ���Ʀr: ");
			String strEnterNum = keyin.readLine();
			int enterNum = Integer.parseInt(strEnterNum);

			
		}
		

	}

}
