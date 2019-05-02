import java.io.*;

public class WORK03_03_Q
{

	public static void main(String[] args) throws IOException
	{
		int sum = 0, tmp1=0, tmp2=0;
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
		
		tmp1 = num1;
		tmp2 = num2;
		
		int diff = num2 - num1;
		System.out.println("數字間格為" + diff);
		
		for (int i=0; i<=diff; i++)
		{
			System.out.println( "sum="+ sum + " + num="+ num1);
			sum = sum + num1;
			num1++;
		}
		System.out.println("for 迴圈總和=" + sum);
		
		sum=0;
		num1 = tmp1;
		num2 = tmp2;
		while (num1 <= num2)
		{
			System.out.println( "sum="+ sum + " + num="+ num1);
			sum = sum + num1;
			num1++;
		}
		System.out.println("while 迴圈總和=" + sum);
		
		sum=0;
		num1 = tmp1;
		do
		{
			System.out.println( "sum="+ sum + " + num="+ num1);
			sum = sum + num1;
			num1 +=1;			
		} while (num1 <= num2 );
		System.out.println("do...while 迴圈總和=" + sum);		
	}

}
