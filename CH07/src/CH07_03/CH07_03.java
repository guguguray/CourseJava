package CH07_03;

class CLine
{
	protected int leng;
	
	CLine(int l)
	{
		this.leng = l;
	}

	public void ShowLine()
	{
		System.out.println("****直線長度****");
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
	
	public void ShowRec()
	{
		System.out.println("****矩形****");
		System.out.println("矩形長度"+leng);
		System.out.println("矩形寬度"+wide);
		int peri = (leng+wide)*2;
		int area = leng * wide;
		System.out.println("矩形周長"+peri);
		System.out.println("矩形面積"+area);
		
		System.out.println("\n呼叫父類別的ShowLine()方法:");
		super.ShowLine();
		System.out.println("\n****顯示父類別的 leng 的值****");
		System.out.println(super.leng);
	}
}
public class CH07_03
{

	public static void main(String[] args)
	{
		CLine sha1 = new CLine(20);		
		sha1.ShowLine();
		
		CRectangle sha2 = new CRectangle(10,5);
		sha2.ShowRec();
	}

}
