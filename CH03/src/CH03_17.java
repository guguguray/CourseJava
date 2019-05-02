// for & for each ®t²§
// ¤Gºû°}¦C
public class CH03_17
{

	public static void main(String[] args)
	{
		int A[][] = new int[2][3];
		
		for (int i=0; i<2; i++)
			for (int j=0; j<3; j++)
			{
				A[i][j] = i+j+1;
				System.out.print(A[i][j] + " ");
			}
		System.out.println("\n");		
		
		for (int i[]:A)
		{
			System.out.print("array" + i[0]+" ");
			for (int j:i)
			{
				System.out.print(j+ " ");
			}
		System.out.println("\n");
		}

	}

}
