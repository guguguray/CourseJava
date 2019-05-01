/* 愛因斯坦的質能轉換公式
 * simple calculation E等於 m*c平方: e=(m*C*C)
 * Data: 2019.01.02
 */
public class CH02_05
{

	public static void main(String[] args)
	{
		int m = 10;
		double C= 2997924581.2, e;
		
		e = m * C * C;
		
		System.out.println("當質數為:" + m);
		System.out.println("所釋放出的能量為:" + e);
	}

}
