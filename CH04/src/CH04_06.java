// ���s�t�m �}�C 2ways 
// 1. ���s���w�}�C�j�p
// 2. ���s���w�}�C�s��������
public class CH04_06
{

	public static void main(String[] args)
	{
		int[] A = new int[]{2, 4, 6, 8, 10, 12};
		System.out.println("Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		A = new int[A.length + 1]; // ���s�t�m�}�C���s���}�C�j�p
		System.out.println("Display re-annange Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		A = new int[]{1,3,5,7,9};	// ���s�t�m�}�C���s���}�C���e
		System.out.println("Display re-annange Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
	}

}
