/* Array exercise
 * 2 method:
 * int[5]
 * new int{item1, item1, item1, item1}
 * */



public class CH04_02
{

	public static void main(String[] args)
	{
		String [] course = new String[5];
		
		course[0] = "�m�W";
		course[1] = "���";
		course[2] = "�ƾ�";
		course[3] = "���|";
		course[4] = "�۵M";
		
		for (int i = 0; i < course.length; i++)
			System.out.print(course[i] + "\t");
		
		System.out.println();
		System.out.print("�d�l��\t");
		
		int[] score = new int[]{100, 96, 97, 86};
		int sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + "\t");
			sum += score[i];
		}			
		System.out.println();
		System.out.println("\nSum=" + sum);
		System.out.println("\nAvg=" + (float)sum/score.length);	
	}
	
}
