// �p����󥿾�ƪ����󦸤�  x^y 
// 

import java.io.*;

public class CH03_13_Exercise
{

	public static void main(String[] args) throws IOException
	{
		int i;
		double totalMultiply = 1;	 //initial multiply	
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		// ��J�����
		System.out.println("�п�J�@�ӫD0�������: ");
		int numBase = Integer.parseInt(keyin.readLine());
		
		while (numBase <= 0)
		{
			System.out.println("!!��ƿ�J���~!!�A�����O�D0������ơA�Э��s��J�����: ");
			numBase = Integer.parseInt(keyin.readLine());			
		}
		
		// ��J�����
		System.out.println("�п�J�@�ӫD0�������: ");
		double numSquare = Integer.parseInt(keyin.readLine());

		while (numSquare <= 0 || numSquare > 50)
		{
			System.out.println("!!��ƿ�J���~!!�A�����O�D0������ƩΤp��50�A�Э��s��J�����: ");
			numSquare = Integer.parseInt(keyin.readLine());			
		}
		
		// �p�⥿��ƪ����赲�G
		for (i = 0; i<numSquare; i++)
		{
			// System.out.print(totalMultiply +" * "+ numBase);
			totalMultiply *= numBase;
			System.out.println(" totalMultiply=" + totalMultiply);
		}
			
	System.out.printf("�z�n�p�� %d �� %d ����A �o�쪺���G�O %.0f" ,numBase ,i , totalMultiply);
	}

}
