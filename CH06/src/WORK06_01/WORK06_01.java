/* 計算面積
 * 圓 = pi * r* r
 * 矩 = 長*寬
 * 立方 = ((長*寬)+(寬*高)+(長*高))*2
 */
package WORK06_01;

class Cal_area
{
	//private int i = 0;
	Cal_area(int r)
	{
		double pi = 3.1416d;
		System.out.println("圓面積:"+ (pi*r*r));	

	}
	
	Cal_area(int longw, int width)
	{
//		System.out.println("傳入字串建構子的s:" + s);
//		this.i = i++;
//		System.out.println("this.i="+this.i+"\ni++="+i+"\nthis.i=i++:"+(this.i=i++));
	}
	
	Cal_area(int longw, int width, int height)
	{
//		this(s);
//		//this(i)
//		System.out.println("傳入整數建構子的i="+i+"\n傳入字串建構子的s:"+s);
	}
}

public class WORK06_01
{

	public static void main(String[] args)
	{
		Cal_area area = new Cal_area(5);
		
	}

}
