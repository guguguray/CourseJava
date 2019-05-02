
/* do while 
 * ―ㄢ计程そ计
 * ㄢ计计(砆埃计)埃计(埃计)..... 緇计 = 0   
 * n=40 m=180             >> 180%40 = 4..(reminder=20)
 * n=reminder=20 m=n=40   >> 40%20 =  2..(reminder=0)
 */

public class CH03_10
{

	public static void main(String[] args)
	{
		int n = 40, m = 180;
		int reminder = 0;
		
		System.out.println("n=" + n + ",m=" + m);
		
		do
		{
			reminder = m % n;
			m = n;
			n = reminder;
			
			System.out.println("m=" + m);
		} while (n != 0);
			
	System.out.println("ㄢ计程そ计" + m);
	}

}
