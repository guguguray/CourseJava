package ch09_16;

public class Ch09_16
{

	public static void main(String[] args)
	{
		String text ="";
		long beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			text = text+"x";
		long endTime = System.currentTimeMillis();
		System.out.println("text=\"\"������ɶ�:"+(endTime-beginTime)+"�@��");
		
		String str = new String();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			str = str.concat("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew String()������ɶ�"+(endTime-beginTime)+"�@��");

		StringBuffer sbf = new StringBuffer();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			sbf = sbf.append("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew StringBuffer()������ɶ�"+(endTime-beginTime)+"�@��");
		
		StringBuilder sbi = new StringBuilder();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			sbi = sbi.append("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew StringBuilder()������ɶ�"+(endTime-beginTime)+"�@��");
	}

}
