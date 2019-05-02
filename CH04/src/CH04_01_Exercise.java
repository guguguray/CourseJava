/* Array re-write code
 * for loop change:
 * for-each loop
 * */

// for-each loop
public class CH04_01_Exercise
{

	public static void main(String[] args)
	{
		int[] A;
		A = new int[5];
		System.out.println("A array length: " + A.length);
		System.out.print("A Array ¤¸¯À­È:");
		
//		for (int i=0; i<A.length; i++)
//			System.out.print(A[i]+" ");
		for (int varA:A)
			System.out.print(varA +" ");
		
		System.out.print("\n");
		
		boolean[] B = new boolean[5];
		System.out.println("B array length: " + B.length);
		System.out.print("B Array ¤¸¯À­È:");
		
//		for (int i=0; i<B.length; i++)
//			System.out.print(B[i]+" ");
		for (boolean verB:B)
			System.out.print(verB + " ");
	}
	
}
