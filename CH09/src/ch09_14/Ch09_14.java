package ch09_14;

public class Ch09_14
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(30);
		String str = new String("Java");
		StringBuffer sb3 = new StringBuffer(str);
		
		System.out.println("sb1������:"+sb1.length());
		System.out.println("sb1���e�q:"+sb1.capacity());
		
		System.out.println("\nsb2������:"+sb2.length());
		System.out.println("sb2���e�q:"+sb2.capacity());
		
		System.out.println("\nsb3�r��w�İϪ����e:"+sb3);
		System.out.println("sb3������:"+sb3.length());
		System.out.println("sb3���e�q:"+sb3.capacity());
		
		sb3.setLength(30);
		System.out.println("\n�]�wsb3�����׫�A�r��w�İϪ����e:"+sb3);
		System.out.println("sb3������:"+sb3.length());
		System.out.println("sb3���e�q:"+sb3.capacity());
		
		sb3.ensureCapacity(43);
		System.out.println("\n�]�wsb3�̤p�e�q��A�r��w�İϪ����e:"+sb3);
		System.out.println("sb3������:"+sb3.length());
		System.out.println("sb3���e�q:"+sb3.capacity());
	}

}
