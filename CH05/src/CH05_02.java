
public class CH05_02
{
	static void Change(int x, int y)
	{
		int t;
		t = x;
		x = y;
		y = t;
		
		System.out.println("Change ��k��:");
		System.out.println("x ="+ x + "\ty =" + y);
		System.out.println();
	}
	public static void main(String[] args)
	{
		int x = 3, y = 5;
		
		System.out.println("�bmain���I�sChange��k�e:");
		System.out.println("x ="+ x + "\ty =" + y);
		
		System.out.println();
		
		Change(x, y);
		
		System.out.println("�bmain���I�sChange��k��:");
		System.out.println("x ="+ x + "\ty =" + y);
	}

}
