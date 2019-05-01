/*  Input/Output: method by Scanner
 *  �ϥ� Scanner �B�z�r��J�즳�ťծɡAkeyin.next(); �|�۰��o���ťդ��᪺�r
 *  �ҥH�r��n�� keyin.nextLine();
 * 1. import java util
 * 2. Declare Scanner 
 *    Scanner keyin;
 *    keyin = new Scanner((System.in));
 * 3. Declare ��J�����r��μƭ�
 *    String str = keyin.next();
 *    int st_i = input_string.nextInt();	
 * 4. Scanner ����
 *    keyin.close();   
 */

import java.util.*;

public class CH02_16
{
	public static void main(String[] args) 
	{
		Scanner input_string;
		input_string = new Scanner(System.in);
		
		System.out.print("[�򥻿�J�m��]\n");	
		
		System.out.print("����J�t�ťժ��r��: ");
		String st = input_string.next();		
		System.out.println("��ܦr��next: " + st);
		st = input_string.nextLine();
		System.out.println("��ܦr��nextLine: " + st);
		
		System.out.print("\n����J�t�ťժ��r��: ");
		String st_s = input_string.nextLine();		
		System.out.println("��ܦr��: " + st_s);	
		
		System.out.print("\n����J���: ");
		int st_i = input_string.nextInt();		
		System.out.println("��ܾ��: " + st_i);
		
		System.out.print("\n����J�����: ");
		long st_l = input_string.nextLong();		
		System.out.println("��ܾ��: " + st_l);	
		
		System.out.print("\n����J�B�I��: ");
		float st_f = input_string.nextFloat();		
		System.out.println("��ܯB�I��: " + st_f);
		
		System.out.print("\n����J����ׯB�I��: ");
		double st_d = input_string.nextDouble();		
		System.out.println("��ܭ���ׯB�I�Ƽ�: " + st_d);
		
		input_string.close();

	}

}
