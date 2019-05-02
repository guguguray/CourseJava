import java.io.*;

/* concatenate two statement
 * add loop for ask to enter score
 * add if to confirm enter valid number  
 * */

public class CH04_02_Execise
{

	public static void main(String[] args) throws IOException
	{
		String [] course = new String[]{"姓名", "國文", "數學", "社會", "自然"};
		int[] score = new int[4];
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));		
		
		// ask to enter score
		for (int i=0; i<score.length; i++)
		{
			System.out.println("請輸入"+ course[i+1] + "成績: ");
			int EnterScore = Integer.parseInt(keyin.readLine());
			
			while ((EnterScore < 0) || (EnterScore > 100))
			{
				System.out.println("輸入不正確，請重新輸入"+ course[i+1] + "成績: ");
				EnterScore = Integer.parseInt(keyin.readLine());
			}
			
			// 取得輸入成績，並放入陣列中
			score[i] = EnterScore;
		}
		
		// 印出 科目及成績
		for (int i = 0; i < course.length; i++)
			System.out.print(course[i] + "\t");
		
		System.out.println();
		System.out.print("吳勁律\t");	

		int sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + "\t");
			sum += score[i];
		}			
		System.out.println();
		System.out.print("\nSum=" + sum);
		System.out.print("\nAvg=" + (float)sum/score.length);	
	}
	
}
