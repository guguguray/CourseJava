/*  Input/Output: method by Scanner
 *  使用 Scanner 處理字串遇到有空白時，keyin.next(); 會自動濾掉空白之後的字
 *  所以字串要用 keyin.nextLine();
 * 1. import java util
 * 2. Declare Scanner 
 *    Scanner keyin;
 *    keyin = new Scanner((System.in));
 * 3. Declare 輸入接收字串或數值
 *    String str = keyin.next();
 *    int st_i = input_string.nextInt();	
 * 4. Scanner 結束
 *    keyin.close();   
 */

import java.util.*;

public class CH02_16
{
	public static void main(String[] args) 
	{
		Scanner input_string;
		input_string = new Scanner(System.in);
		
		System.out.print("[基本輸入練習]\n");	
		
		System.out.print("請鍵入含空白的字串: ");
		String st = input_string.next();		
		System.out.println("顯示字串next: " + st);
		st = input_string.nextLine();
		System.out.println("顯示字串nextLine: " + st);
		
		System.out.print("\n請鍵入含空白的字串: ");
		String st_s = input_string.nextLine();		
		System.out.println("顯示字串: " + st_s);	
		
		System.out.print("\n請鍵入整數: ");
		int st_i = input_string.nextInt();		
		System.out.println("顯示整數: " + st_i);
		
		System.out.print("\n請鍵入長整數: ");
		long st_l = input_string.nextLong();		
		System.out.println("顯示整數: " + st_l);	
		
		System.out.print("\n請鍵入浮點數: ");
		float st_f = input_string.nextFloat();		
		System.out.println("顯示浮點數: " + st_f);
		
		System.out.print("\n請鍵入倍精度浮點數: ");
		double st_d = input_string.nextDouble();		
		System.out.println("顯示倍精度浮點數數: " + st_d);
		
		input_string.close();

	}

}
