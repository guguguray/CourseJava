package ch09_20;

public class Ch09_20
{

	public static void main(String[] args)
	{
		double d1=12.53, d2=12.5;
		System.out.println("d1=" + d1);
		System.out.println("ceil(" + d1 + ")=" + Math.ceil(d1));
		System.out.println("floor("+ d1 + ")=" + Math.floor(d1));
		System.out.println("round("+ d1 + ")=" + Math.round(d1));
		System.out.println("rint(" + d1 + ")=" + Math.rint(d1));
		
		System.out.println();
		
		System.out.println("d2=" + d2);
		System.out.println("rint(" + d2 + ")=" + Math.rint(d2));
		System.out.println();
		
		double d3=-12.53, d4=-12.5;
		System.out.println("d3="+d3);
		System.out.println("ceil("+d3+")="+Math.ceil(d3));
		System.out.println("floor("+d3+")="+Math.floor(d3));
		System.out.println("round("+d3+")="+Math.round(d3));
		System.out.println("rint("+d3+")="+Math.rint(d3));
		
		System.out.println();
		
		System.out.println("d4="+d4);
		System.out.println("rint("+d4+")="+Math.rint(d4));
		System.out.println();
		

	}

}
