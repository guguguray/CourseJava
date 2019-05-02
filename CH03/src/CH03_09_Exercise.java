// 改用 for loop: n=1 加到 10 累計總數

public class CH03_09_Exercise
{

	public static void main(String[] args)
	{
		int n = 1, sum = 0;
		
		for (n=1; n<=10; n++)
		{
			System.out.print("n=" + n);
			sum += n;
			System.out.println("\t累加值=" + sum);
			
		}

	System.out.println("loop over!");
	}
}
