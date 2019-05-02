import java.io.*;

public class WORK03_03_Q
{

	public static void main(String[] args) throws IOException
	{
		int sum = 0;
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please Enter 1st number: ");
		String st1 = keyin.readLine();
		int num1 = Integer.parseInt(st1);	

		System.out.print("Please Enter 2nd number: ");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);	
	
		while (num2 < num1)
		{
			System.out.print("Error:數字2必須大於數字1， Please re-Enter 2nd number: ");
			st2 = keyin.readLine();
			num2 = Integer.parseInt(st2);	
		}
		
		int diff = num2 - num1;
		System.out.println("數字間格為" + diff);
	
		for (int i=num1; i<diff; i++)
		{
			System.out.println("i="+ i + "sum="+ sum);
			sum = sum + num1
		}
	}

}
