// Exercise: Student Score
import java.io.*;
public class WORK04_02
{

	public static void main(String[] args) throws IOException
	{
		String[] rank = new String[11]; 
		int[] arrStuds;
		int sum;

		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入學生人數: ");
		String strStud = keyin.readLine();
		int numStud = Integer.parseInt(strStud);		
		System.out.println(numStud);
		arrStuds = new int[numStud];
		for (int i=0; i<numStud; i++)
		{
			System.out.println("請輸入第" + (i+1) + "位學生成績: ");
			String strScore = keyin.readLine();
			int score = Integer.parseInt(strScore)
			
		}
		
		

	}

}
