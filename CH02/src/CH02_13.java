/*  Input/Output: Basic input : (Char)
 * 1. import java io
 * 2. add "throws IOException" after main() method
 * 3. declare datatype char:
 *    char myInputChar =  (char)System.in.read()
 */

import java.io.*;

public class CH02_13
{
	public static void main(String[] args) throws IOException 
	{
		char myData;
		
		System.out.print("[基本輸入練習]\n");
		
		System.out.print("請輸入文字: ");		
		myData = (char)System.in.read();
		
		System.out.println("輸入的資料為: " + myData);
	}

}
