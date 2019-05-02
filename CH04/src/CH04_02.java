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
		
		course[0] = "姓名";
		course[1] = "國文";
		course[2] = "數學";
		course[3] = "社會";
		course[4] = "自然";
		
		for (int i = 0; i < course.length; i++)
			System.out.print(course[i] + "\t");
		
		System.out.println();
		System.out.print("吳勁律\t");
		
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
