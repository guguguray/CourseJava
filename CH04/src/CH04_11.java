/* 
 * Array ���e�Ƨ�: �ɾ� 
 * + 
 */
public class CH04_11
{

	public static void main(String[] args)
	{
		int[] A = new int[]{18,14,12,16,10};
		int i, j, k, t;
		
		System.out.print("Arrays A's order: ");
		for (i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		for (i=3; i>=0; i--)	//n-1 �`��(0-3)
		{
			for (j=0; j<=i; j++)
				if (A[j] > A[j+1])
				{
					t=A[j+1];
					A[j+1] = A[j];
					A[j] = t;
				}
			
			System.out.print(" ��" + (4-i)+ "��:");
			for (k=0;k<A.length;k++)
				System.out.print(A[k] + " ");
			
			System.out.println();	
		}
	}

}
