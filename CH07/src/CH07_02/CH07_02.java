package CH07_02;

class CLine
{
	protected int leng;
	
	CLine()
	{
		System.out.println("\n����CLine���O���a�޼ƪ��غc�l");
	}
	
	CLine(int x, int y)
	{
		System.out.println("����CLine(int x, int y)���O�ݨ�Ӥ޼ƪ��غc�l");
		System.out.println("�ǤJ�غc�l���޼�x="+x+"y="+y);

	}
	
	public void SetLeng(int l)
	{
		leng = 1;
		System.out.println("���u����="+leng);
	}
}

class CRectangle extends CLine
{
	private int wide;
	
	CRectangle()
	{
		System.out.println("\n����CRectangle���O���a�޼ƪ��غc�l");		
	}
	
	CRectangle(int x, int y)
	{
		System.out.println("����CRectangle(int x, int y)���O�ݨ�Ӥ޼ƪ��غc�l");
		System.out.println("�ǤJ�غc�l���޼�x="+x+"y="+y);		
	}
	public void SetValue(int l, int w)
	{
		leng = l;
		wide = w;
		System.out.println("�x�Ϊ���"+leng);
		System.out.println("�x�μe��"+wide);
	}
}
public class CH07_02
{

	public static void main(String[] args)
	{
		CLine sha1 = new CLine();
		
		sha1.SetLeng(l)20;

	}

}
