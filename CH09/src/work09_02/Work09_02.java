package work09_02;

import java.util.*;

public class Work09_02
{

	public static void main(String[] args)
	{
		String[] oilList = {"92�L�]�A26.4�A60", "92�L�]�A26.4�A45", 
				"98�L�]�A29.9�A54", "95�L�]�A27.9�A49", "98�L�]�A29.9�A55"};
		String myTitle = "�~�W\t���\t�ƶq\t���B";
		System.out.println(myTitle);
		
		for (int i=0; i<oilList.length; i++){
//			System.out.println(oilList[i]);
			toSeg(oilList[i]);
			
		}
	}
	static void toSeg(String str){
		StringTokenizer str1 = new StringTokenizer(str,"�A");
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
