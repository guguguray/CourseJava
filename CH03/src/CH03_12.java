// 迴圈 {break} 與 {break 標記} 的差異

public class CH03_12
{

	public static void main(String[] args)
	{
		int i, j;	
		// break 後跳出內圈， 外圈繼續執行
		for (i = 0; i<10; i++)
		{
			for (j = 1; j<=i; j++)
			{
				if (j == 5)
					break;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("跳出雙層迴圈");

		// break 後跳到 out1 標籤
		out1:
		{
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j<=i; j++)
				{
					if (j == 5)
						break out1;
					System.out.print(j);
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}

}
