package ch09_08;

public class Ch09_08
{

	public static void main(String[] args)
	{
		String str1="Happy Birthday to you";
		System.out.println("���N�e:"+str1);
		System.out.println("���N��:"+str1.replace("you", "joe")+"\n");
		
		String str2 = "  Happy Birthday to you  ";
		System.out.println("�h���e:"+str2);
		System.out.println("�h���ťիe�A�r�����:"+str2.length());
		String str2_new = str2.trim();
		System.out.println("�h����:"+str2_new);
		System.out.println("�h���ťիe�A�r�����:"+str2_new.length());		
		
		
	}

}
