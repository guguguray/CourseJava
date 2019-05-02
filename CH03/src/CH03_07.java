// 1~10 間奇數的合  1+3+5+7+9

public class CH03_07
{
	public static void main(String[] args)
	{
		System.out.println("====Sum of even==== ");
		int sum = 0;
		
		System.out.println("All even:");
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			if (i % 2!=0)
			{
				sum += i;
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.println("Answer = " + sum);

	}
}
