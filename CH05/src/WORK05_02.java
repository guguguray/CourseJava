
	/* 
	 * �Ƨ�: ����
	 * + 
	 */
import java.io.*;

public class WORK05_02
	{

	public static void main(String[] args) throws IOException
	{
		int[] myList;
		int i, j, k, t, enterNum;
			
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));		
			
		System.out.println("�п�J�}�C���� (2~10): ");
		int arrLen = Integer.parseInt(keyin.readLine());
			
		while (arrLen < 2 || arrLen > 10)
		{
			System.out.print("�}�C���׶��b 2~10 �����A�Э��s��J�}�C����: ");
			arrLen = Integer.parseInt(keyin.readLine());
		}
		
		// System.out.println(arrLen);
		myList = new int[arrLen];
		
		for (i=0; i<arrLen; i++)
		{
			System.out.print("�п�J��"+(i+1)+"���Ʀr(0-100): ");
			enterNum =  Integer.parseInt(keyin.readLine());
			
			while (enterNum < 0 || enterNum > 100)
			{
				System.out.println("�Ʀr�����b0-100���A�Э��s��J: ");
				arrLen = Integer.parseInt(keyin.readLine());
			}
			myList[i] = enterNum;
		}
		System.out.print("myList array: ");
		for (i=0; i<arrLen; i++)
		{
			System.out.print(myList[i] + " ");
		}
		
		
			 
		
			//int[] A = new int[]{18,14,12,16,10};
//			int i, j, k, t;
//			
//			System.out.print("Arrays A's order: ");
//			for (i = 0; i < A.length; i++)
//				System.out.print(A[i]+"\t");
//			
//			System.out.println("\n");
//			
//			for (i=3; i>=0; i--)	//n-1 �`��(0-3)
//			{
//				for (j=0; j<=i; j++)
//					if (A[j] > A[j+1])
//					{
//						t=A[j+1];
//						A[j+1] = A[j];
//						A[j] = t;
//					}
//				
//				System.out.print(" ��" + (4-i)+ "��:");
//				for (k=0;k<A.length;k++)
//					System.out.print(A[k] + " ");
//				
//				System.out.println();	
//			}
		}
	}


