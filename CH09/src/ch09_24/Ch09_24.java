package ch09_24;

import java.util.*;

public class Ch09_24
{

	public static void main(String[] args)
	{
		Calendar Cal = Calendar.getInstance();
		System.out.println(Cal);
		
		System.out.println("\n"+Cal.get(Calendar.YEAR)+"年");
		System.out.println(Cal.get(Calendar.MONTH)+"月");
		System.out.println(Cal.get(Calendar.DAY_OF_MONTH)+"日");
		System.out.println(Cal.get(Calendar.HOUR)+"時");
		System.out.println(Cal.get(Calendar.MINUTE)+"分");
		System.out.println(Cal.get(Calendar.SECOND)+"秒");
		System.out.println(Cal.get(Calendar.AM_PM)==0?"上午":"下午");
		System.out.println(Cal.get(Calendar.MILLISECOND)+"毫秒");
		
		System.out.println("\n本週是該年的第"+Cal.get(Calendar.WEEK_OF_YEAR)+"週");
		System.out.println("本週是該月的第"+Cal.get(Calendar.WEEK_OF_MONTH)+"週");
		
		System.out.println("\n本日是該年的第"+Cal.get(Calendar.DAY_OF_YEAR)+"日");
		System.out.println("本日是該月的第"+Cal.get(Calendar.DAY_OF_MONTH)+"日");
		System.out.println("本日是該週的第"+Cal.get(Calendar.DAY_OF_WEEK)+"日");
		
		System.out.println("\n現在的日期時間:"+Cal.getTime());	// 較常用的方式
		System.out.println("目前的時間戳記:"+Cal.getTimeInMillis());	 // 較常用的方式

	}

}
