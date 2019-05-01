/*  Input/Output: input:(String) method by BufferedReader
 * 
 * 1. import java io
 * 2. add "throws IOException" after main() method
 * 3. Declare BufferedReader 
 *    BufferedReader keyin;
 *    keyin = new BufferedReader(new InputStreamReader(System.in));
 * 4. Declare 接收輸入 字串: 
 *    String str = keyin.readLine();
 */

import java.io.*;

public class CH02_14
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input_string;
		input_string = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[基本輸入練習]\n");
		System.out.print("請鍵入字串: ");
		
		String st = input_string.readLine();
		System.out.println("顯示字串: " + st);
	}

}
