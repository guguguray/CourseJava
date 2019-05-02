import java.io.*;

/* 
 * Search value in Array
 * + 
 */
public class CH04_12
{

	public static void main(String[] args) throws IOException
	{
		int[] account = new int[]{20,18,12,16,10,24,14,22};
		
		System.out.print("Array's value: ");
		for (int i = 0; i < account.length; i++)
			System.out.print(account[i]+" ");
		int i, num, search_num;
		
		System.out.println("\n使用線性搜尋法，請輸入要尋找的數字: ");
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		search_num = Integer.parseInt(keyin.readLine());
		num = -1;
		for (i=0; i<account.length;i++)
			if (account[i] == search_num)
			{
				num = i;
				break;
			}
		
		if (num == -1)
			System.out.println("\n" + search_num +" Not found!!");
		else
			System.out.println("Search number: " + search_num +" is in array position: " + (i+1) + " (index:" + i + ")");

	}

}
