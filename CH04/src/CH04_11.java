/* 
 * Array 內容排序: 升冪  
 * 氣泡排序: 香良資料倆倆比較，左邊比右邊大時做交換
 * 第一次循環，最大的會移到最右邊
 * 第二次循環，第二大的資料回移到倒數第二位
 * ... 以此類推
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
		// n-1 循環次數()，五筆資料交換次數: 共4次
		for (i=3; i>=0; i--)	
		{
			for (j=0; j<=i; j++)
				if (A[j] > A[j+1])
				{
					// 如果第一筆比第二筆(代表第一筆要移到第二筆)，先把設成暫存:第二筆數值記下來
					t=A[j+1];
					// 變更第二筆為第一筆的內容
					A[j+1] = A[j];
					// 第一筆變為暫存的第二筆
					A[j] = t;
				}
				
			
			System.out.print(" 第" + (4-i)+ "次:");
			for (k=0;k<A.length;k++)
				System.out.print(A[k] + " ");
			
			System.out.println();	
		}
	}

}
