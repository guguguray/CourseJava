/* ���󥿾�ƪ����󦸤�
 * ���󥿾��: k
 * ���󦸤�: n
 * 
 */


import java.io.*;

public class CH03_13_Exercise_Q
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		//  ��J ��� �H�� �����
		System.out.println("�п�J�����: ");
		int k = Integer.parseInt(keyin.readLine());
		System.out.println("�п�J�����: ");
		int n = Integer.parseInt(keyin.readLine());
		
		long num = 1;
		for (int i = 0; i < n; i++)
		{
			num *= k;
		}
		System.out.printf("%d(k) ��  %d(n) ����= %d ", k, n, num);

	}

}
