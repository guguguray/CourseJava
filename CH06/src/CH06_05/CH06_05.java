package CH06_05;

class Cstudent
{
	public static int count = 0;
	public int num = 0;
	private int tot;
	
	Cstudent()
	{
		count++;
		num++;
	}
	public int GetTot(int chi, int eng)
	{
		tot = chi + eng;
		return tot;
	}	
}
public class CH06_05
{

	public static void main(String[] args)
	{
		Cstudent s1 = new Cstudent();
		System.out.println("s1.num=" + s1.num);
		System.out.println("��" + Cstudent.count + "��");
		System.out.println("�`��" + GetTot(80,90));
		
		Cstudent s2 = new Cstudent();
		System.out.println("s2.num="+s2.num);
		System.out.println("��" + Cstudent.count + "��");
		System.out.println("�`��" + GetTot(100,100));
		
		
	}

}
