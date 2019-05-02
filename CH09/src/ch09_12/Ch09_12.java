package ch09_12;

import java.io.*;

public class Ch09_12
{

	public static void main(String[] args) throws IOException
	{
		String str = "Time and Tide wait for no man.";
		
		BufferedReader keyin;
		keyin =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("目標字串:"+str+"\n");
		
		System.out.print("請輸入要在目標字串中，搜尋的字串(第一次出現):");
		String st = keyin.readLine();
		int index=-1;
		index = str.indexOf(st);
		
		if (index==-1)
			System.out.println("\n沒有在目標字串中，找到搜尋的字串。");
		else
			System.out.println("\n在第"+(index+1) + "的位置起，找到要搜尋的字串。");
		
		System.out.print("\n請輸入要在目標字串中，搜尋的字串(最後一次出現):");
		st = keyin.readLine();
		index=-1;
		index = str.lastIndexOf(st);
		if (index==-1)
			System.out.println("\n沒有在目標字串中，找到搜尋的字串。");
		else
			System.out.println("\n在第"+(index+1) + "的位置起，找到要搜尋的字串。");
	}

}
