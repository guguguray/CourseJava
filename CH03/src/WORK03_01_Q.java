/* 綜合練習1
 * 輸入 0-100之間數字
 */

import java.io.*;

public class WORK03_01_Q
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please Enter your score: ");
		int score = Integer.parseInt(keyin.readLine());
		
		// 判斷輸入的數字不在 0-100 之間，請重新輸入數字
		while ((score < 0) || (score > 100))
		{
			System.out.print("Please Enter your score: ");
			score = Integer.parseInt(keyin.readLine());
		}
		
		String grade = " ";
		
		if (score == 100)
			grade = "甲";
		else if ((score < 100) && (score >= 80))
			grade = "乙";
		else if ((score < 80) && (score >= 60))
			grade = "丙";
		else
			grade = "丁";
		
		System.out.println("score= " + score + " 等級評比為" + grade);
	}

}
