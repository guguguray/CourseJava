/*  Input/Output: input:(數值) method by BufferedReader
 * 
 * 1. import java io
 * 2. add "throws IOException" after main() method
 * 3. Declare BufferedReader 
 *    BufferedReader keyin;
 *    keyin = new BufferedReader(new InputStreamReader(System.in));
 * 4. Declare 輸入接收字串
 *    String str = keyin.readLine();
 *    
 * 5. 字串轉為數值型別 
 *    - BufferedReader 方法輸入所接收的型別一定是字串 String，要處理數值必須再轉一次數值的型別
 * 	  int num = Integer.parseInt(str);
 * 
 * 4 & 5 也可整合成一行:   
 *    int num = Integer.parseInt(keyin.readLine());
 */

import java.io.*;

public class CH02_15
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input_string;
		input_string = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[基本輸入練習]\n");
		// 請使用者輸入字串
		System.out.print("請輸入整數字串: ");
		String st = input_string.readLine();
		
		System.out.println();
		
		// 將字串轉為數值型別
		int num1 = Integer.parseInt(st);
		long numL = Long.parseLong(st);
		float numF = Float.parseFloat(st);
		double numD = Double.parseDouble(st);
		
		System.out.println("顯示整數數值: " + num1 + "\n");
		System.out.println("顯示長整數數值: " + numL + "\n");
		System.out.println("顯示浮點數數值: " + numF + "\n");
		System.out.println("顯示倍精度浮點數數值: " + numD + "\n");
	}

}
