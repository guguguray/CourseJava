// continue �P �t�X���Ҫ��t��

public class CH03_14
{

	public static void main(String[] args)
	{
		int i, j;
		// break ����X����A �~���~�����
		for (i = 1; i<10; i++)
		{
			for (j = 1; j<=i; j++)
			{
				if (j == 5)
					continue;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		//System.out.println("���X���h�j��");

		out1:
		for (i = 1; i < 10; i++)
		{
			for (j = 1; j<=i; j++)
			{
				if (j == 5)
					continue out1;					
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

}

