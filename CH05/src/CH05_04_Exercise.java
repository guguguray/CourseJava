import java.io.*;

public class CH05_04_Exercise
{
	static long Fact(int n)
	{
		if (n == 0)
			return 1;
		
		if (n ==1)
			return 1;
		else
			return n * Fact(n-1);
	}
	public static void main(String[] args) throws IOException
	{
		long fact_val;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number (0-20)");
		String strNum = keyin.readLine();
		int num = Integer.parseInt(strNum);
		
		while (num < 0 || num > 20)
		{
			System.out.println("Wrong number: valid number should be (0-20)");
			strNum = keyin.readLine();
			num = Integer.parseInt(strNum);
		}
		
		
		System.out.println("5!="+ Fact(5));		
		System.out.println();
		
		fact_val = Fact(num);
		System.out.println(num + "!="+ fact_val);

	}

}
