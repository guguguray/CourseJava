// while loop: n=1 �[�� 10 �֭p�`��
public class CH03_09
{

	public static void main(String[] args)
	{
		int n = 1, sum = 0;
		while (n <= 10)
		{
			System.out.print("n=" + n);
			sum+=n;
			System.out.println("\t�֥[��=" + sum);
			n++;
		}
	System.out.println("loop over!");
	}

}
