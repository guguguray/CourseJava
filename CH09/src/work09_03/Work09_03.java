package work09_03;

import java.io.*;
import java.util.*;
import java.text.*;

public class Work09_03
{

	public static void main(String[] args) throws IOException
	{
		String[] myQuesList = {"2+6=___", "______ you student", "�ɫe____���A�æ��a�W��"};
		String[] myAnsList = {"8", "Are", "����"};
		int count=0;
		String ans;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		Date date1 = new Date();
		DateFormat df = new SimpleDateFormat("�{�b�ɶ�: yyyy-mm-dd hh:mm:ss");
		System.out.println(df.format(date1));
		
		System.out.println("�ж�J���T������: ");
		
		for (int i=0; i<myQuesList.length; i++) {
			System.out.println(myQuesList[i]);
			ans = keyin.readLine();
			
			System.out.println("enter="+ans);
			// Compare with correct answer
			if (ans.equals(myAnsList[i])) {
				count++;
			} 
			else {
				System.out.println("�z�����F�A���T���׬O:" + myAnsList[i]);
			}
			
		}
		System.out.println("Count="+count);
		System.out.print("�z������: ");
		// �[�J��������
		switch (count) {
			case 0: 
				System.out.println("Really Bad");
				break;
			case 1: 
				System.out.println("Bad");
				break;
			case 2: 
				System.out.println("well");
				break;
			case 3: 
				System.out.println("Good");
				break;
		}
			 
	}
}
