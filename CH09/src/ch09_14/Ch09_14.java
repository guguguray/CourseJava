package ch09_14;

public class Ch09_14
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(30);
		String str = new String("Java");
		StringBuffer sb3 = new StringBuffer(str);
		
		System.out.println("sb1的長度:"+sb1.length());
		System.out.println("sb1的容量:"+sb1.capacity());
		
		System.out.println("\nsb2的長度:"+sb2.length());
		System.out.println("sb2的容量:"+sb2.capacity());
		
		System.out.println("\nsb3字串緩衝區的內容:"+sb3);
		System.out.println("sb3的長度:"+sb3.length());
		System.out.println("sb3的容量:"+sb3.capacity());
		
		sb3.setLength(30);
		System.out.println("\n設定sb3的長度後，字串緩衝區的內容:"+sb3);
		System.out.println("sb3的長度:"+sb3.length());
		System.out.println("sb3的容量:"+sb3.capacity());
		
		sb3.ensureCapacity(43);
		System.out.println("\n設定sb3最小容量後，字串緩衝區的內容:"+sb3);
		System.out.println("sb3的長度:"+sb3.length());
		System.out.println("sb3的容量:"+sb3.capacity());
	}

}
