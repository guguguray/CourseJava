package ch09_13;

public class Ch09_13
{

	public static void main(String[] args)
	{
		String str1 = "Imagination is more important than knowledge";
		String str2 = "�ɫe������A�ìO�a�W��";
		
		System.out.println("�N str1 �r��A�����ন�j�g");
		System.out.println(str1.toUpperCase());
		System.out.println("\n�N str1 �r��A�����ন�p�g");
		System.out.println(str1.toLowerCase());
		
		String[] aArray = str1.split(" ");
		String[] bArray = str1.split(" ", 2);
		String[] cArray = str2.split("");
		
		System.out.println("\n�N str1 �r��A�H�ťլ����j�Ÿ��A���Ϊ����G:");
		for (String d:aArray)
			System.out.println(d);
		
		System.out.println("\n�N str1 �r��A�H�ťլ����j�Ÿ��A������Ψ⦸�A���Ϊ����G:");
		for (String d:bArray)
			System.out.println(d);
		
		System.out.println("\n�N str2 �r��A�H�r�������j�Ÿ��A���Ϊ����G:");
		for (String d:cArray)
			System.out.print(d);
	}

}
