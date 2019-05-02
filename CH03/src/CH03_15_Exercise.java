// 1+10 羆 ノㄧΑよΑ盿
// 策肈: э1-10 案计羆


public class CH03_15_Exercise
{

	public static void main(String[] args)
	{
		int cacl = sum(10);
		System.out.println("(案计羆)= " + cacl);

	}
	
	static int sum(int num)
	{
		int total = 0;
		for (int i=1; i <=num; i++)
		{
			if (i % 2 == 0) 	// э1-10 案计羆
			{
				System.out.print(i+" ");
				total += i;	
			}						
		}
		return total;
	}

}
