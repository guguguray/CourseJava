/* two Arrays exercise
 * �y��		���		�^�� 	�ƾ�  �̰���	�̧C��
 * 1		96		88		76	  (??)	 (??)
 * 2		90		98		70    (??)	 (??)
 * 3		76		70		98    (??)	 (??)
 */

public class CH04_03
{
	public static void main(String[] args)
	{
		String[] arr1 = new String[]{"�y��", "���", "�^��", "�ƾ�", "�̰���", "�̧C��"};
		int[][] arr2 = new int[][]{{1, 92, 88, 76}, {2, 90, 98, 70}, {3, 82, 69, 98}};
		int max=0, min=0;

		
		// output Title: �y�� 	���	 	�^��		�ƾ�		�̰���		�̧C��
		for (int r = 0; r<arr1.length; r++)
			System.out.print(arr1[r] + "\t");
		
		System.out.println();	
		
		//for each��k output Title: �y�� 	���	 	�^��		�ƾ�		�̰���		�̧C��
//		for (String st:arr1)
//			System.out.print(st + "\t");
		
		for(int i = 0; i < arr2.length; i++)
		{
			max=0;
			min=101;
			for (int j = 0; j < arr2[i].length; j++)
			{
				if ((j>0) && (arr2[i][j]>max))
				{
					max = arr2[i][j];
//					System.out.print("max=" + max);
				}
				
				if ((j>0) && (arr2[i][j]<min))
				{
					min = arr2[i][j];
//					System.out.println("\tmin=" + min);
				}
				System.out.print(arr2[i][j] + "\t");
			}	
			System.out.print(max + "\t"+ min);
			System.out.println();
		}
		
// Teacher's code		
//		for (int i=0; i<arr2.length; i++)
//		{
//			int max = 0, min = 100;
//			for (int j=0; j<arr2[i].length; j++)
//			{
//				if (arr2[i][j] > max)
//					max = arr2[i][j];
//				
//				if (j > 0)
//					if (arr2[i][j] < min)
//						min = arr2[i][j];
//				
//				System.out.print(arr2[i][j] + "\t");				
//			}
//			System.out.print(max + "\t" + min);
//			System.out.println();
//		}
		
	}
	
}
