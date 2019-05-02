/*
 * AND Gate
 * 0 0 =0
 * 0 1 =0
 * 1 0 =0
 * 1 1 =1
 * AND 0 1
 *  0  0 0
 *  1  0 1
 */
import java.io.*;

public class CH03_05
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input 0 or 1: ");
		String st1 = keyin.readLine();
		int num1 = Integer.parseInt(st1);
		
		System.out.print("input 0 or 1: ");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);
		
		System.out.print("\n AND ÅÞ¿è¹h(" + num1 + "," + num2 + ")");
		
		if ((num1 == 0) && (num2 == 0))
			System.out.println("=0");
		else if ((num1 == 0) && (num2 == 1))
			System.out.println("=0");
		else if ((num1 == 1) && (num2 == 0))
			System.out.println("=0");
		else
			System.out.println("=1");			

	}

}
