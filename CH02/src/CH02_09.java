/* 位元運算子 2進位 
 * ~: 補數
 * &: AND
 * |: OR
 * ^: XOR  
 */

public class CH02_09
{

	public static void main(String[] args)
	{
		int a = 15, b = 3;
		System.out.println("15 & 3 return value: " + (a & b));
		System.out.println("15 | 3 return value: " + (a | b));
		System.out.println("15 ^ 3 return value: " + (a ^ b));
		System.out.println("~3 return value: " + (~b));	//answer = -4 (1100)
	}

}
