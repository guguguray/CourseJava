package ch09_08;

public class Ch09_08
{

	public static void main(String[] args)
	{
		String str1="Happy Birthday to you";
		System.out.println("¨ú¥N«e:"+str1);
		System.out.println("¨ú¥N«á:"+str1.replace("you", "joe")+"\n");
		
		String str2 = "  Happy Birthday to you  ";
		System.out.println("¥h°£«e:"+str2);
		System.out.println("¥h°£ªÅ¥Õ«e¡A¦r¦êªø«×:"+str2.length());
		String str2_new = str2.trim();
		System.out.println("¥h°£«á:"+str2_new);
		System.out.println("¥h°£ªÅ¥Õ«e¡A¦r¦êªø«×:"+str2_new.length());		
		
		
	}

}
