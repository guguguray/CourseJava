// break; example:

public class CH03_11
{

	public static void main(String[] args)
	{
		int i, num = 1;		
		
		for (i = 0; i<10; i++)
		{
			num *= 2;
			System.out.println("num=" + num);
			if (num > 20)
				break;
		}
			
	System.out.printf("break exe. i=%d, num=%d" ,i , num);
	}

}
