// for �P for each(�u�� �}�C�~��) ���t��
// �@���}�C
public class CH03_16
{

	public static void main(String[] args)
	{
		int A[] = {1,2,3,4,5,6,7,8,9};
		char B[] = {'H','a','p','p', 'y'};
		
		System.out.println("�Ʀr�}�C for �Ϊk:");
		for (int i=0; i < A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println("\n");

		System.out.println("�r���}�C for �Ϊk");
		for (int i=0; i<B.length; i++)
			System.out.print(B[i]+" ");
		System.out.println("\n");	
		
		System.out.println("�Ʀr�}�C for each �Ϊk:"); 	// for (myArray���O �ܼƦW:myArray)
		for (int i: A)
			System.out.print(i + " "); 					// ������X i �Y�i
		System.out.println("\n");

		System.out.println("�r���}�C for each�Ϊk");
		for (char i:B)
			System.out.print(i + " ");
		System.out.println("\n");			
		
		
	}

}
