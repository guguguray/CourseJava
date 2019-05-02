// for 與 for each(只有 陣列才有) 的差異
// 一維陣列
public class CH03_16
{

	public static void main(String[] args)
	{
		int A[] = {1,2,3,4,5,6,7,8,9};
		char B[] = {'H','a','p','p', 'y'};
		
		System.out.println("數字陣列 for 用法:");
		for (int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println("\n");

		System.out.println("字元陣列 for 用法");
		for (int i=0; i<B.length; i++)
			System.out.print(B[i]+" ");
		System.out.println("\n");	
		
		System.out.println("數字陣列 for each 用法:"); 	// for (myArray型別 變數名:myArray)
		for (int i: A)
			System.out.print(i + " "); 					// 直接輸出 i 即可
		System.out.println("\n");

		System.out.println("字元陣列 for each用法");
		for (char i:B)
			System.out.print(i + " ");
		System.out.println("\n");			
		
		
	}

}
