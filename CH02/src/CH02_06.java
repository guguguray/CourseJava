/* Simple calculation
 * Data: 2018.01.02
 */
public class CH02_06
{

	public static void main(String[] args)
	{
		int apple = 15, banana = 20;
				
		System.out.print("(1).小明買蘋果15顆，香蕉20條，水果共買了");
		System.out.println((apple + banana) + "個");
		System.out.print("(2).蘋果每顆10元，香蕉每條3元，水果總共花費");
		System.out.println((apple * 10  + banana * 3) + "元");
		System.out.print("(3).將蘋果4個和香蕉3個裝成一盒，共可包裝");
		System.out.println((apple / 4) + "盒");
		System.out.println("(4).裝盒後蘋果剩下" + (apple % 4) + "個" + "香蕉剩下" + (20 - 3 * 3) + "個");

	}

}
