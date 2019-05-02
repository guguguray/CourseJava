// for 迴圈: 九九乘法表  改直印

public class CH03_08_Exercise
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9 ; i++)
		{
			
			for (int j = 1 ; j <= 9; j++)
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");  // 改直印 ， i j  前後對調為 j i 即可
			
		System.out.print("\n");
		}

	}

}
