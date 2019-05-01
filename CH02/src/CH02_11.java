// 運算式

public class CH02_11
{

	public static void main(String[] args)
	{
		int A = 4;
		
		System.out.println("A = " + A);
		System.out.println("A+=3+2: " + (A += 3 + 2));	//A=A+5= 9
		System.out.println("A-=5-4: "+ (A -= 5 - 4));	//A=A-1= 8
		System.out.println("A*=2*3: " + (A *= 2 * 3));	//A=A*6= 48
		System.out.println("A/=10/5+3: " + (A /= 10 / 5 + 3));	//A=A/5 取商= 48/5 =9..3
		System.out.println("A%=10%3: " + (A %= 10 % 3)); //A=A%1取餘= 9%1= 9..0
	}

}
