// 1+��10 �[�` �Ψ禡���覡�a�J
// ���D: ��1-10 ���Ƭۥ[�`�X


public class CH03_15_Exercise
{

	public static void main(String[] args)
	{
		int cacl = sum(10);
		System.out.println("(���Ƭۥ[�`�X)= " + cacl);

	}
	
	static int sum(int num)
	{
		int total = 0;
		for (int i=1; i <=num; i++)
		{
			if (i % 2 == 0) 	// ��1-10 ���Ƭۥ[�`�X
			{
				System.out.print(i+" ");
				total += i;	
			}						
		}
		return total;
	}

}
