// 1~10 間偶數的合  +4+6+8+10

public class CH03_07_Exercise
{
	public static void main(String[] args)
	{
		System.out.println("==== Sum of odd ==== ");
		int sum = 0;
		
		System.out.println("All odd between 1-10:");
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.println("Answer = " + sum);

	}
}
