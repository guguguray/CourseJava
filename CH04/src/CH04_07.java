/* 
 * Duplicate array: 
 * cannot duplicate array by using assign method
 * + 
 */
public class CH04_07
{

	public static void main(String[] args)
	{
		int[] A = new int[]{2, 4, 6, 8, 10, 12};
		System.out.print("Arrays A: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		int[] B = A;
		System.out.print("\nArrays B: ");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i]+"\t");
		
		System.out.println("\n\n��� B[3]=50 -----------------------------------\n");
		B[3] = 50;
		
		System.out.print("Arrays A: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.print("\nArrays B: ");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i]+"\t");
		
		

	}

}
