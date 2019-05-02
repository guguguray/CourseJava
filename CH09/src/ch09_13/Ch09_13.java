package ch09_13;

public class Ch09_13
{

	public static void main(String[] args)
	{
		String str1 = "Imagination is more important than knowledge";
		String str2 = "床前明月光，疑是地上霜";
		
		System.out.println("將 str1 字串，全部轉成大寫");
		System.out.println(str1.toUpperCase());
		System.out.println("\n將 str1 字串，全部轉成小寫");
		System.out.println(str1.toLowerCase());
		
		String[] aArray = str1.split(" ");
		String[] bArray = str1.split(" ", 2);
		String[] cArray = str2.split("");
		
		System.out.println("\n將 str1 字串，以空白為分隔符號，切割的結果:");
		for (String d:aArray)
			System.out.println(d);
		
		System.out.println("\n將 str1 字串，以空白為分隔符號，限制切割兩次，切割的結果:");
		for (String d:bArray)
			System.out.println(d);
		
		System.out.println("\n將 str2 字串，以逗號為分隔符號，切割的結果:");
		for (String d:cArray)
			System.out.print(d);
	}

}
