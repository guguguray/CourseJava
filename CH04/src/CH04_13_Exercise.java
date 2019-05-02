import java.io.*;

/* 
 * Search value in Array
 * + 
 */
public class CH04_13_Exercise
{

	public static void main(String[] args) throws IOException
	{
		int[] account = new int[]{18, 14, 12, 16, 10};
		String[] name = new String[]{"王五","張三","陳二","李四","鄭一"};

		int i, j, k, account_t = 0;
			
		System.out.println("Origional array: \n");
		for (i = 0; i < account.length; i++)
			System.out.println(" " + account[i] + "\t" + name[i]);
		
		System.out.println();
		
		for (i=account.length-2; i>=0; i--)
			for (j=0; j<=i; j++)
				if (account[j] > account[j+1])
				{
					account_t = account[j+1];
					account[j+1] = account[j];
					account[j] = account_t;	
					
				}
		System.out.println("\n氣泡排序法後的資料順序:\n");
		for (i=0;i<account.length; i++)
			System.out.print(" " + account[i]);
		
		System.out.println();
		
		System.out.println("\n二分搜尋法: 請輸入要找的字元: ");
		int search_ch = (int)System.in.read();
		
		int low = 0, high = account.length-1, mid_num = (low+high)/2, num=-1; 
		
		while (true)
		{
			System.out.println("low=" + low + " high=" + high + " mid_num=" + mid_num);
			
			if (account[mid_num] == search_ch)
			{
				num = mid_num;
				k++;
				break;
			}
			
			if (low == high || mid_num<low || mid_num>high)
			{
				num=-1;
				k++;
				break;
			}
			
			if (account[mid_num] > search_ch)
				high = mid_num+1;
			else
				low = mid_num +1;
			
			mid_num = (low+high)/2;
			k++;
		}
		if (num == -1)
			System.out.println("\n Not found!!");
		else
			System.out.println("Found num: \'" + account[num] + "\'" + ":  times of search: " + k);
	}

}
