/* ��X�m��1
 * ��J 0-100�����Ʀr
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
		
		// �P�_��J���Ʀr���b 0-100 �����A�Э��s��J�Ʀr
		while ((score < 0) || (score > 100))
		{
			System.out.print("Please Enter your score: ");
			score = Integer.parseInt(keyin.readLine());
		}
		
		String grade = " ";
		
		if (score == 100)
			grade = "��";
		else if ((score < 100) && (score >= 80))
			grade = "�A";
		else if ((score < 80) && (score >= 60))
			grade = "��";
		else
			grade = "�B";
		
		System.out.println("score= " + score + " ���ŵ���" + grade);
	}

}
