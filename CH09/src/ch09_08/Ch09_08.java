package ch09_08;

public class Ch09_08
{

	public static void main(String[] args)
	{
		String str1="Happy Birthday to you";
		System.out.println("取代前:"+str1);
		System.out.println("取代後:"+str1.replace("you", "joe")+"\n");
		
		String str2 = "  Happy Birthday to you  ";
		System.out.println("去除前:"+str2);
		System.out.println("去除空白前，字串長度:"+str2.length());
		String str2_new = str2.trim();
		System.out.println("去除後:"+str2_new);
		System.out.println("去除空白前，字串長度:"+str2_new.length());		
		
		
	}

}
