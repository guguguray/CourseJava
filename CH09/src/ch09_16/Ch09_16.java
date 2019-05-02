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
		System.out.println("text=\"\"的執行時間:"+(endTime-beginTime)+"毫秒");
		
		String str = new String();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			str = str.concat("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew String()的執行時間"+(endTime-beginTime)+"毫秒");

		StringBuffer sbf = new StringBuffer();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			sbf = sbf.append("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew StringBuffer()的執行時間"+(endTime-beginTime)+"毫秒");
		
		StringBuilder sbi = new StringBuilder();
		beginTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++)
			sbi = sbi.append("x");
		endTime = System.currentTimeMillis();		
		System.out.println("\nnew StringBuilder()的執行時間"+(endTime-beginTime)+"毫秒");
	}

}
