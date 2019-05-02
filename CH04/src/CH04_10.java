/* 
 * Duplicate Array: arraycopy
 * + 
 */
public class CH04_10
{

	public static void main(String[] args)
	{
		int[] A = new int[]{1, 2, 3, 4, 5};
		int[] B = new int[A.length];
		
		System.out.print("Arrays A: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.print("\nArray's B: ");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i]+"\t");
		
		System.out.println("\n\n用arraycopy 方法，複製A陣列的元素到B陣列中");
				
		System.out.println("\n\n更改 B[3]=50 -----------------------------------\n");
		B[3] = 50;
		
		System.out.print("Arrays A: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.print("\nArrays B: ");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i]+"\t");
		
		

	}

}
