/*  Input/Output: input:(String) method by BufferedReader
 * 
 * 1. import java io
 * 2. add "throws IOException" after main() method
 * 3. Declare BufferedReader 
 *    BufferedReader keyin;
 *    keyin = new BufferedReader(new InputStreamReader(System.in));
 * 4. Declare ������J �r��: 
 *    String str = keyin.readLine();
 */

import java.io.*;

public class CH02_14
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input_string;
		input_string = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[�򥻿�J�m��]\n");
		System.out.print("����J�r��: ");
		
		String st = input_string.readLine();
		System.out.println("��ܦr��: " + st);
	}

}
