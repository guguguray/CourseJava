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
		
		System.out.print("[�򥻿�J�m��]\n");
		
		System.out.print("�п�J��r: ");		
		myData = (char)System.in.read();
		
		System.out.println("��J����Ƭ�: " + myData);
	}

}
