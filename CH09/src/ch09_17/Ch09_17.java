package ch09_17;

import java.util.*;

public class Ch09_17
{

	public static void main(String[] args)
	{
		String name1, age1, address1, mobile1;
		// �H tab ���j
		String str1="�m�W	�~��		�a�}		��ʹq��";
		StringTokenizer str2 = new StringTokenizer(str1);
		boolean cut1 = str2.hasMoreTokens();
		int numstr1 = str2.countTokens();
		System.out.println("�r��str1�O�_�i����:"+cut1);
		System.out.println("�@�i���ά�"+numstr1+"�����");
		name1 = str2.nextToken();
		age1 = str2.nextToken();
		address1 = str2.nextToken();
		mobile1 = str2.nextToken();
		System.out.printf("\n%s\t%s\t%s\t%s", name1, age1, address1, mobile1);
		
		System.out.println();
		
		int age2;
		String name2, address2, mobile2;
		String str3 = "�i�T�A30�A�x�_���A0931-345678";
		
		StringTokenizer str4 = new StringTokenizer(str3, "�A");
		int numstr2 = str4.countTokens();
		name2 = str4.nextToken();
		age2 = Integer.parseInt(str4.nextToken());
		address2 = str4.nextToken();
		mobile2 = str4.nextToken();
		boolean cut2 = str2.hasMoreTokens();
		System.out.printf("\n%s\t%s\t%s\t%s", name2, age2, address2, mobile2);
		System.out.println("\n\n�r��str3�O�_�i����:"+cut2);
		System.out.println("str3�@�i���ά�"+numstr2+"�����");
		
	}

}
