package work09_02;

import java.util.*;

public class Work09_02
{

	public static void main(String[] args)
	{
		String[] oilList = {"92無鉛，26.4，60", "92無鉛，26.4，45", 
				"98無鉛，29.9，54", "95無鉛，27.9，49", "98無鉛，29.9，55"};
		String myTitle = "品名\t單價\t數量\t金額";
		System.out.println(myTitle);
		
		for (int i=0; i<oilList.length; i++){
//			System.out.println(oilList[i]);
			toSeg(oilList[i]);
			
		}
	}
	static void toSeg(String str){
		StringTokenizer str1 = new StringTokenizer(str,"，");
		String name;
		int num;
		double price, money;
		
		name = str1.nextToken();
		price = Double.parseDouble(str1.nextToken());
		num = Integer.parseInt(str1.nextToken());
		money = price * num;
		System.out.println(name + "\t" + price + "\t" + num + "\t" + money);
	}
	
}
