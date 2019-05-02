import java.io.*;

/* concatenate two statement
 * add loop for ask to enter score
 * add if to confirm enter valid number  
 * */

public class CH04_02_Execise
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		while () 
		{
			System.out.println("Enter 瓣ゅだ计: ");
			String st1 = keyin.readLine();
			int num1 = Integer.parseInt(st1);
		}
		
		
		System.out.println("Enter 计厩だ计: ");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);
		System.out.println("Enter 穦だ计: ");
		String st3 = keyin.readLine();
		int num3 = Integer.parseInt(st3);
		System.out.println("Enter 礛だ计: ");
		String st4 = keyin.readLine();
		int num4 = Integer.parseInt(st4);
		
		String [] course = new String[]{"﹎", "瓣ゅ", "计厩", "穦", "礛"};
				
		for (int i = 0; i < course.length; i++)
			System.out.print(course[i] + "\t");
		
		System.out.println();
		System.out.print("玪\t");
		
		int[] score = new int[4];		
		score[0] = num1;
		score[1] = num2;
		score[2] = num3;
		score[3] = num4;
		
		int sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + "\t");
			sum += score[i];
		}			
		System.out.println();
		System.out.println("\nSum=" + sum);
		System.out.println("\nAvg=" + (float)sum/score.length);	
	}
	
}
