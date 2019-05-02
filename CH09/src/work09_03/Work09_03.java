package work09_03;

import java.io.*;
import java.util.*;
import java.text.*;

public class Work09_03
{

	public static void main(String[] args) throws IOException
	{
		String[] myQuesList = {"2+6=___", "______ you student", "床前____光，疑似地上霜"};
		String[] myAnsList = {"8", "Are", "明月"};
		int count=0;
		String ans;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		Date date1 = new Date();
		DateFormat df = new SimpleDateFormat("現在時間: yyyy-mm-dd hh:mm:ss");
		System.out.println(df.format(date1));
		
		System.out.println("請填入正確的答案: ");
		
		for (int i=0; i<myQuesList.length; i++) {
			System.out.println(myQuesList[i]);
			ans = keyin.readLine();
			
			System.out.println("enter="+ans);
			// Compare with correct answer
			if (ans.equals(myAnsList[i])) {
				count++;
			} 
			else {
				System.out.println("您答錯了，正確答案是:" + myAnsList[i]);
			}
			
		}
		System.out.println("Count="+count);
		System.out.print("您的評分: ");
		// 加入評分等級
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
