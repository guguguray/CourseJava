// 1+到10 加總 用函式的方式帶入


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
