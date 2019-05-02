// Copy Array
// using loop method: copy A Array to B Array 

public class CH04_08
{

	public static void main(String[] args)
	{
		int[] A = new int[]{2, 4, 6, 8, 10, 12};
		System.out.println("Display Array A: ");
		for (int i=0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}
		
		System.out.println("\n\n===Copy A_Array to B_Array===\n");
		int[] B = new int[A.length];
		// loop for copy array
		for (int i=0; i < A.length; i++) {
			B[i] = A[i];
		}
		System.out.println("Display Array B: ");
		for (int i=0; i < B.length; i++) {
			System.out.print(B[i] + "\t");
		}
		System.out.println("\nChange A[1]'s value:\n");
		A[1] = 2;
		
		System.out.println("Re- Display Array A: ");
		for (int i=0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}

	}

}
