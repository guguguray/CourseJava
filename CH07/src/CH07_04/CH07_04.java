package CH07_04;

final class CLine
{
	protected int leng=5;
	
	CLine(int l)
	{
		this.leng = l;
	}

	public final void ShowLine()
	{
		System.out.println("****直線****");
		System.out.println("直線長度="+leng);
	}
}

class CRectangle extends CLine
{
	private int wide;
	
	CRectangle(int l, int w)
	{
		super(l);
		this.wide = w;
	}
	
	public void ShowLine()
	{
		System.out.println("****矩形****");
		System.out.println("矩形長度"+leng);
		System.out.println("矩形寬度"+wide);
	}

	public void ShowRec()
	{
		int peri = (leng + wide) * 2;
		int area = leng * wide;
		System.out.println("矩形周長"+peri);
		System.out.println("矩形面積"+area);
	}
}
public class CH07_04
{

	public static void main(String[] args)
	{
		CLine sha1 = new CLine(20);		
		sha1.ShowLine();
		
		CRectangle sha2 = new CRectangle(10,5);
		sha2.ShowLine();
		sha2.ShowRec();
	}
}
