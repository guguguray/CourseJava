/* 
 * Array ���e�Ƨ�: �ɾ�  
 * ��w�Ƨ�: ���}��ƭǭǤ���A�����k��j�ɰ��洫
 * �Ĥ@���`���A�̤j���|����̥k��
 * �ĤG���`���A�ĤG�j����Ʀ^����˼ƲĤG��
 * ... �H������
 */
public class CH04_11
{

	public static void main(String[] args)
	{
		int[] A = new int[]{18,14,12,16,10};
		int i, j, k, t;
		
		System.out.print("Arrays A's order: ");
		for (i = 0; i < A.length; i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n");
		// n-1 �`������()�A������ƥ洫����: �@4��
		for (i=3; i>=0; i--)	
		{
			for (j=0; j<=i; j++)
				if (A[j] > A[j+1])
				{
					// �p�G�Ĥ@����ĤG��(�N��Ĥ@���n����ĤG��)�A����]���Ȧs:�ĤG���ƭȰO�U��
					t=A[j+1];
					// �ܧ�ĤG�����Ĥ@�������e
					A[j+1] = A[j];
					// �Ĥ@���ܬ��Ȧs���ĤG��
					A[j] = t;
				}
				
			
			System.out.print(" ��" + (4-i)+ "��:");
			for (k=0;k<A.length;k++)
				System.out.print(A[k] + " ");
			
			System.out.println();	
		}
	}

}
