package ch09_03;

public class Ch09_03
{

	public static void main(String[] args)
	{
		Character ch1 = new Character('a');
		Character ch2 = new Character('b');
		
		int result = ch1.compareTo(ch2);
		System.out.println("\nresult:"+result+" ch1=" + ch1+",ch2="+ch2 );
		
		if (result == 0)
			System.out.println("字元物件 ch1=ch2");
		else if (result <0)
			System.out.println("字元物件 ch1<ch2");
		else
			System.out.println("字元物件 ch1>ch2");
		
		System.out.println("\n字元物件 ch1=ch2: " + ch1.equals(ch2));
	}

}
