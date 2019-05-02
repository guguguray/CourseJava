package ch09_04;

public class Ch09_04
{

	public static void main(String[] args)
	{
		// 宣告為變數時， 會放到 heap 中的 String pool 
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		
		System.out.println();
		System.out.println(str1.equals(str2));
		
		System.out.println();
		
		// 兩個 字串物件 判定為不相等，因為宣告物件時，會再heap 中產不同的物件
		String str3 = new String("Hello"); 
		String str4 = new String("Hello");
		System.out.println(str3 == str4);
		
		System.out.println();
		System.out.println(str3.equals(str4));
	}

}
