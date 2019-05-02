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
		System.out.println("****���u����****");
		System.out.println("���u����="+leng);
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
		System.out.println("****�x��****");
		System.out.println("�x�Ϊ���"+leng);
		System.out.println("�x�μe��"+wide);
		int peri = (leng+wide)*2;
		int area = leng * wide;
		System.out.println("�x�ΩP��"+peri);
		System.out.println("�x�έ��n"+area);
		
		System.out.println("\n�I�s�����O��ShowLine()��k:");
		super.ShowLine();
		System.out.println("\n****��ܤ����O�� leng ����****");
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
