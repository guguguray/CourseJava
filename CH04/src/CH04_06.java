// 重新配置 陣列 2ways 
// 1. 重新指定陣列大小
// 2. 重新指定陣列新的元素值
public class CH04_06
{

	public static void main(String[] args)
	{
		int[] A = new int[]{2, 4, 6, 8, 10, 12};
		System.out.println("Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		A = new int[A.length + 1]; // 重新配置陣列成新的陣列大小
		System.out.println("Display re-annange Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		
		A = new int[]{1,3,5,7,9};	// 重新配置陣列成新的陣列內容
		System.out.println("Display re-annange Arrays: ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
	}

}
