import java.io.*;

public class WORK03_01_Q
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please Enter your score: ");
		String st1 = keyin.readLine();
		int score = Integer.parseInt(st1);
	
		while ((score < 0) || (score > 100))
		{
			System.out.print("Please Enter your score: ");
			st1 = keyin.readLine();
			score = Integer.parseInt(st1);
		}
		
		String grade = " ";
		if (score == 100)
			grade = "¥Ò";
		else if ((score < 100) && (score >= 80))
			grade = "¤A";
		else if ((score < 80) && (score >= 60))
			grade = "¤þ";
		else
			grade = "¤B";
		
		System.out.println("score= " + score + " µ¥¯Åµû¤ñ¬°" + grade);
	}

}
