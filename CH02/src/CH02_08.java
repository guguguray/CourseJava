// compare : return true false
public class CH02_08
{
	public static void main(String[] args)
	{
		int a = 15, b = 3;
		
		System.out.println("(a>10) return value: " + (a > 10));
		System.out.println("!(a>10) return value: " + !(a > 10));
		System.out.println("(a>10)&(b>5) return value: " + (a > 10 & b > 5));
		System.out.println("(a>10)&&(b>5) return value: " + (a > 10 && b > 5));
		System.out.println("(a>10)|(b>5) return value: " + (a > 10 | b > 5));
		System.out.println("(a>10)||(b>5) return value: " + (a > 10 || b > 5));
		System.out.println("(a>10)^(b>5) (XOR) return value: " + (a > 10 ^ b > 5));
	}
}
