//Random:  (int)(Math.random()*(Y-X+1))+X
import java.io.*;

public class WORK05_01
{
	static int twoRandNum()
	{
		int num1 = (int)(Math.random()*(20-5+1))+5;
		int num2 = (int)(Math.random()*(10-0+1))+0;
		System.out.println(num1+"*"+num2+"=" );	
		return num1 * num2;
		
	}
	
	static int judge(int ans, int right, int score)
	{
		if (ans == right)
		{
			System.out.println("Right Answer!!!");
			score += 25;
		}
		else
		{
			System.out.println("Wrong Answer!!!");
		}
		System.out.println();
		return score;
	}
	public static void main(String[] args) throws IOException
	{

		int ans, reTurnValue, score=0;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		reTurnValue = twoRandNum();
		ans = Integer.parseInt(keyin.readLine());
		
		score = judge(ans, reTurnValue, score);
		

	}

}
