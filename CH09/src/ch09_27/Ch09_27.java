package ch09_27;

import java.text.*;

public class Ch09_27
{

	public static void main(String[] args)
	{
		double d1 = 12345.765;
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		
		System.out.println("计Α:"+ d1);
		
		System.out.print("\n╰参箇砞硄ノΑΑて计:");
		System.out.println(nf1.format(d1));
		System.out.print("\n╰参箇砞砯刽ΑΑて计:");
		System.out.println(nf2.format(d1));
		System.out.print("\n╰参箇砞俱计ΑΑて计:");
		System.out.println(NumberFormat.getIntegerInstance().format(d1));
		System.out.print("\n╰参箇砞κだゑよΑΑて计:");
		System.out.println(NumberFormat.getPercentInstance().format(d1));
		
		nf1.setMaximumFractionDigits(2);
		System.out.print("\n程计ㄢよΑΑて计:");
		System.out.println(nf1.format(d1));
		
		nf1.setMaximumIntegerDigits(2);
		System.out.print("\n程俱计ㄢよΑΑて计:");
		System.out.println(nf1.format(d1));
		

	}

}
