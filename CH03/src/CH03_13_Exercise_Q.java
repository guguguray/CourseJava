/* 任何正整數的任何次方
 * 任何正整數: k
 * 任何次方: n
 * 
 */


import java.io.*;

public class CH03_13_Exercise_Q
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		//  輸入 整數 以及 次方數
		System.out.println("請輸入正整數: ");
		int k = Integer.parseInt(keyin.readLine());
		System.out.println("請輸入次方數: ");
		int n = Integer.parseInt(keyin.readLine());
		
		long num = 1;
		for (int i = 0; i < n; i++)
		{
			num *= k;
		}
		System.out.printf("%d(k) 的  %d(n) 次方= %d ", k, n, num);

	}

}
