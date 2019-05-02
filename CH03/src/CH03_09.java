// while loop: n=1 加到 10 累計總數
public class CH03_09
{

	public static void main(String[] args)
	{
		int n = 1, sum = 0;
		while (n <= 10)
		{
			System.out.print("n=" + n);
			sum+=n;
			System.out.println("\t累加值=" + sum);
			n++;
		}
	System.out.println("loop over!");
	}

}
