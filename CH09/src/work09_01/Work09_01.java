// Count total Vowel;

package work09_01;

import java.io.*;

public class Work09_01
{

	public static void main(String[] args) throws IOException
	{
		int count=0;
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入英文句子: ");
		String mySent = keyin.readLine();
		mySent = mySent.toLowerCase();
		System.out.println("Output: "+mySent);
//		System.out.println(mySent.substring(0,1));
//		System.out.println(mySent.substring(1,2));
		
		for (int i=0; i<mySent.length(); i++) {
//			System.out.println(mySent.charAt(i));
			if ((mySent.charAt(i) == 'a') || (mySent.charAt(i) == 'e') || (mySent.charAt(i) == 'i') 
					|| (mySent.charAt(i) == 'o') || (mySent.charAt(i) == 'u')) {
					count++;
			}
		}
		System.out.println("Count="+coun);	

	}

}
