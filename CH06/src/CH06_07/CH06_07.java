package CH06_07;

class ThisTest
{
	private int i = 0;
	ThisTest(int i)
	{
		System.out.println("傳入整數建構子的參數i="+i+"\n類別的資料成員i="+this.i);
		this.i = i + 1;
		System.out.println("類別的資料成員執行this.i=i+1的結果:"+ this.i);
		System.out.println("i-1="+(i-1)+"\nthis.i="+ (this.i+1));
	}
	
	ThisTest(String s)
	{
		System.out.println("傳入字串建構子的s:" + s);
		this.i = i++;
		System.out.println("this.i="+this.i+"\ni++="+i+"\nthis.i=i++:"+(this.i=i++));
	}
	
	ThisTest(int i, String s)
	{
		this(s);
		//this(i)
		System.out.println("傳入整數建構子的i="+i+"\n傳入字串建構子的s:"+s);
	}
	
	public ThisTest increment()
	{
		this.i++;
		System.out.println("類別的資料成員this.i++:"+this.i);
		System.out.println("返回this:"+this);
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
