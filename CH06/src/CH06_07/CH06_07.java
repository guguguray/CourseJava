package CH06_07;

class ThisTest
{
	private int i = 0;
	ThisTest(int i)
	{
		System.out.println("�ǤJ��ƫغc�l���Ѽ�i="+i+"\n���O����Ʀ���i="+this.i);
		this.i = i + 1;
		System.out.println("���O����Ʀ�������this.i=i+1�����G:"+ this.i);
		System.out.println("i-1="+(i-1)+"\nthis.i="+ (this.i+1));
	}
	
	ThisTest(String s)
	{
		System.out.println("�ǤJ�r��غc�l��s:" + s);
		this.i = i++;
		System.out.println("this.i="+this.i+"\ni++="+i+"\nthis.i=i++:"+(this.i=i++));
	}
	
	ThisTest(int i, String s)
	{
		this(s);
		//this(i)
		System.out.println("�ǤJ��ƫغc�l��i="+i+"\n�ǤJ�r��غc�l��s:"+s);
	}
	
	public ThisTest increment()
	{
		this.i++;
		System.out.println("���O����Ʀ���this.i++:"+this.i);
		System.out.println("��^this:"+this);
		return this;
	}
}
public class CH06_07
{

	public static void main(String[] args)
	{
		ThisTest tt0 = new ThisTest(10);
		ThisTest tt1 = new ThisTest("ok");
		ThisTest tt2 = new ThisTest(20, "ok again!");
		System.out.println(tt0.increment());
	}

}
