package ch09_23;

import java.util.*;

public class Ch09_23
{

	public static void main(String[] args)
	{
		Date date1 = new Date();
		Date date2 = new Date();
		
		System.out.println("data1="+date1);
		System.out.println("data2="+date2);
		
		long t1 = date1.getTime();
		long t2 = date2.getTime();
		System.out.println("\ndata1.Time="+t1);
		System.out.println("data2.Time="+t2);
		System.out.print("\ndata1팒data2촑�_й데:");
		System.out.println(date1.equals(date2));
		
		long a = (long)(Math.random()*1000000);
		long b = (long)(Math.random()*1000000);
		date1.setTime(t1+a);
		date2.setTime(t2+b);
		
		System.out.println("\ndata1="+date1);
		System.out.println("data2="+date2);
		System.out.print("\ndata1팒data2촑�_й데:");
		System.out.println(date1.compareTo(date2));

	}

}
