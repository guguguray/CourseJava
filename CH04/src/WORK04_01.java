//Exercise : Lottery

public class WORK04_01
{

	public static void main(String[] args)
	{
		int numMin = 1, numMax = 42, flag=0;
		int[] arrRan = new int[5];
		int numRan;
		numRan = (int)(Math.random() * (numMax - numMin + 1))+ numMin;
		System.out.println(numRan);
		
		while (flag=0)
		{
			
		}
			
		// Array value
		for (int i=0; i<arrRan.length; i++)
			System.out.println(arrRan[i]);
		

	}

}
