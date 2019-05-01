/*  Input/Output: input:(�ƭ�) method by BufferedReader
 * 
 * 1. import java io
 * 2. add "throws IOException" after main() method
 * 3. Declare BufferedReader 
 *    BufferedReader keyin;
 *    keyin = new BufferedReader(new InputStreamReader(System.in));
 * 4. Declare ��J�����r��
 *    String str = keyin.readLine();
 *    
 * 5. �r���ର�ƭȫ��O 
 *    - BufferedReader ��k��J�ұ��������O�@�w�O�r�� String�A�n�B�z�ƭȥ����A��@���ƭȪ����O
 * 	  int num = Integer.parseInt(str);
 * 
 * 4 & 5 �]�i��X���@��:   
 *    int num = Integer.parseInt(keyin.readLine());
 */

import java.io.*;

public class CH02_15
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input_string;
		input_string = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[�򥻿�J�m��]\n");
		// �ШϥΪ̿�J�r��
		System.out.print("�п�J��Ʀr��: ");
		String st = input_string.readLine();
		
		System.out.println();
		
		// �N�r���ର�ƭȫ��O
		int num1 = Integer.parseInt(st);
		long numL = Long.parseLong(st);
		float numF = Float.parseFloat(st);
		double numD = Double.parseDouble(st);
		
		System.out.println("��ܾ�Ƽƭ�: " + num1 + "\n");
		System.out.println("��ܪ���Ƽƭ�: " + numL + "\n");
		System.out.println("��ܯB�I�Ƽƭ�: " + numF + "\n");
		System.out.println("��ܭ���ׯB�I�Ƽƭ�: " + numD + "\n");
	}

}
