package ch09_12;

import java.io.*;

public class Ch09_12
{

	public static void main(String[] args) throws IOException
	{
		String str = "Time and Tide wait for no man.";
		
		BufferedReader keyin;
		keyin =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�ؼЦr��:"+str+"\n");
		
		System.out.print("�п�J�n�b�ؼЦr�ꤤ�A�j�M���r��(�Ĥ@���X�{):");
		String st = keyin.readLine();
		int index=-1;
		index = str.indexOf(st);
		
		if (index==-1)
			System.out.println("\n�S���b�ؼЦr�ꤤ�A���j�M���r��C");
		else
			System.out.println("\n�b��"+(index+1) + "����m�_�A���n�j�M���r��C");
		
		System.out.print("\n�п�J�n�b�ؼЦr�ꤤ�A�j�M���r��(�̫�@���X�{):");
		st = keyin.readLine();
		index=-1;
		index = str.lastIndexOf(st);
		if (index==-1)
			System.out.println("\n�S���b�ؼЦr�ꤤ�A���j�M���r��C");
		else
			System.out.println("\n�b��"+(index+1) + "����m�_�A���n�j�M���r��C");
	}

}
