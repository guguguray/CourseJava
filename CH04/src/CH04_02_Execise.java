import java.io.*;

/* concatenate two statement
 * add loop for ask to enter score
 * add if to confirm enter valid number  
 * */

public class CH04_02_Execise
{

	public static void main(String[] args) throws IOException
	{
		String [] course = new String[]{"�m�W", "���", "�ƾ�", "���|", "�۵M"};
		int[] score = new int[4];
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));		
		
		// ask to enter score
		for (int i=0; i<score.length; i++)
		{
			System.out.println("�п�J"+ course[i+1] + "���Z: ");
			int EnterScore = Integer.parseInt(keyin.readLine());
			
			while ((EnterScore < 0) || (EnterScore > 100))
			{
				System.out.println("��J�����T�A�Э��s��J"+ course[i+1] + "���Z: ");
				EnterScore = Integer.parseInt(keyin.readLine());
			}
			
			// ���o��J���Z�A�é�J�}�C��
			score[i] = EnterScore;
		}
		
		// �L�X ��ؤΦ��Z
		for (int i = 0; i < course.length; i++)
			System.out.print(course[i] + "\t");
		
		System.out.println();
		System.out.print("�d�l��\t");	

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
