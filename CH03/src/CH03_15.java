// 1+��10 �[�` �Ψ禡���覡�a�J


public class CH03_15
{

	public static void main(String[] args)
	{
		int cacl = sum(10);
		System.out.println("1+....+10=" + cacl);

	}
	static int sum(int num)
	{
		int total = 0;
		for (int i=1; i <=num; i++)
		{
			total += i;			
		}
		return total;
	}

}
