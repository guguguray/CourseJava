// 計算任何正整數的任何次方  x^y 
// 

import java.io.*;

public class CH03_13_Exercise
{

	public static void main(String[] args) throws IOException
	{
		int i;
		double totalMultiply = 1;	 //initial multiply	
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		// 輸入正整數
		System.out.println("請輸入一個非0的正整數: ");
		int numBase = Integer.parseInt(keyin.readLine());
		
		while (numBase <= 0)
		{
			System.out.println("!!資料輸入錯誤!!，必須是非0的正整數，請重新輸入正整數: ");
			numBase = Integer.parseInt(keyin.readLine());			
		}
		
		// 輸入次方數
		System.out.println("請輸入一個非0的次方數: ");
		double numSquare = Integer.parseInt(keyin.readLine());

		while (numSquare <= 0 || numSquare > 50)
		{
			System.out.println("!!資料輸入錯誤!!，必須是非0的次方數或小於50，請重新輸入次方數: ");
			numSquare = Integer.parseInt(keyin.readLine());			
		}
		
		// 計算正整數的次方結果
		for (i = 0; i<numSquare; i++)
		{
			// System.out.print(totalMultiply +" * "+ numBase);
			totalMultiply *= numBase;
			System.out.println(" totalMultiply=" + totalMultiply);
		}
			
	System.out.printf("您要計算 %d 的 %d 次方， 得到的結果是 %.0f" ,numBase ,i , totalMultiply);
	}

}
