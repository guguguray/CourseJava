/* �p�⭱�n
 * �� = pi * r* r
 * �x = ��*�e
 * �ߤ� = ((��*�e)+(�e*��)+(��*��))*2
 */
package WORK06_01;

class Cal_area
{
	//private int i = 0;
	Cal_area(int r)
	{
		double pi = 3.1416d;
		System.out.println("�ꭱ�n:"+ (pi*r*r));	

	}
	
	Cal_area(int longw, int width)
	{
//		System.out.println("�ǤJ�r��غc�l��s:" + s);
//		this.i = i++;
//		System.out.println("this.i="+this.i+"\ni++="+i+"\nthis.i=i++:"+(this.i=i++));
	}
	
	Cal_area(int longw, int width, int height)
	{
//		this(s);
//		//this(i)
//		System.out.println("�ǤJ��ƫغc�l��i="+i+"\n�ǤJ�r��غc�l��s:"+s);
	}
}

public class WORK06_01
{

	public static void main(String[] args)
	{
		Cal_area area = new Cal_area(5);
		
	}

}
