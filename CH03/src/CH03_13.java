// continue example
// 2�� 10���� =1024

public class CH03_13
{

	public static void main(String[] args)
	{
		int i, j = 0, num = 1;
//		for (i = 0; i < 10; i++)
//		{
//			System.out.println("i="+ i + " j=" + j + " num=" + num);
//			num *= 2;
//			if (num > 20)
//				continue;			
//			j++;			
//		}
		for (i=0; i<10; i++)
		{
			num= num * 2;
		}
		System.out.printf("i=%d, j=%d, num=%d", i, j, num);

	}

}