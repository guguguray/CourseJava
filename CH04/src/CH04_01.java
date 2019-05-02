// 一維陣列 宣告及指定陣列大小
public class CH04_01
{

	public static void main(String[] args)
	{
		int[] A;
		A = new int[5];
		System.out.println("A array length: " + A.length);
		System.out.print("A Array 元素質:");
		
		for (int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
		System.out.print("\n");
		
		boolean[] B = new boolean[5];
		System.out.println("B array length: " + B.length);
		System.out.print("B Array 元素質:");
		
		for (int i=0; i<B.length; i++)
			System.out.print(B[i]+" ");
	}
	
}
