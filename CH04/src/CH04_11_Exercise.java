/* 
 * �Ƨ�: ����
 * + 
 */
import java.io.*;

public class CH04_11_Exercise
{

	public static void main(String[] args) throws IOException
	{
		int[] A;
		int i, j, k, t;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.println("�п�J�}�C���� (2~10): ");
		
		String st_arrLen = keyin.readLine(); 
		int arrLen = Integer.parseInt(st_arrLen);
		
		while (arrLen < 2 || arrLen > 10)
		{
			System.out.println("�}�C���׶��b 2~10 �����A�Э��s��J�}�C����: ");
			st_arrLen = keyin.readLine(); 
			arrLen = Integer.parseInt(st_arrLen);
		}
		
		
	
		//int[] A = new int[]{18,14,12,16,10};
//		int i, j, k, t;
//		
//		System.out.print("Arrays A's order: ");
//		for (i = 0; i < A.length; i++)
//			System.out.print(A[i]+"\t");
//		
//		System.out.println("\n");
//		
//		for (i=3; i>=0; i--)	//n-1 �`��(0-3)
//		{
//			for (j=0; j<=i; j++)
//				if (A[j] > A[j+1])
//				{
//					t=A[j+1];
//					A[j+1] = A[j];
//					A[j] = t;
//				}
//			
//			System.out.print(" ��" + (4-i)+ "��:");
//			for (k=0;k<A.length;k++)
//				System.out.print(A[k] + " ");
//			
//			System.out.println();	
//		}
	}
}
