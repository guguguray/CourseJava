import java.io.*;

/* 
 * Search value in Array
 * + 
 */
public class CH04_13
{

	public static void main(String[] args) throws IOException
	{
		char[] ch = new char[]{'G','P','R','D','H','K','F','A'};

		int i,j,k = 0;
		char ch_t;
			
		System.out.println("Re-order array: \n");
		for (i = 0; i < ch.length; i++)
			System.out.print(" " + ch[i]);
		
		System.out.println();
		
		for (i=ch.length-2; i>=0; i--)
			for (j=0; j<=i; j++)
				if (ch[j] > ch[j+1])
				{
					ch_t = ch[j+1];
					ch[j+1] = ch[j];
					ch[j] = ch_t;					
				}
		System.out.println("\n氣泡排序法後的資料順序:\n");
		for (i=0;i<ch.length; i++)
			System.out.print(" " + ch[i]);
		
		System.out.println();
		
		System.out.println("\n二分搜尋法: 請輸入要找的字元: ");
		int search_ch = (char)System.in.read();
		
		int low = 0, high = ch.length-1, mid_num = (low+high)/2, num=-1; 
		
		while (true)
		{
			System.out.println("low=" + low + " high=" + high + " mid_num=" + mid_num);
			
			if (ch[mid_num] == search_ch)
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
			
			if (ch[mid_num] > search_ch)
				high = mid_num+1;
			else
				low = mid_num +1;
			
			mid_num = (low+high)/2;
			k++;
		}
		if (num == -1)
			System.out.println("\n Not found!!");
		else
			System.out.println("Found char: \'" + ch[num] + "\'" + ":  times of search: " + k);
	}

}
