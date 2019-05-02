package CH07_10;

interface ILimit
{
	int HIGH =110;
	int LOW = 60;
	
	String Drive();
}

interface IDistance
{
	void Process(int min);
}

class CTruck implements ILimit
{
	private int speed;
	
	CTruck(int speed)
	{
		this.speed = speed;
	}
	
	public String Drive()
	{
		if (speed > HIGH)
			return "�ثe�W�t�A�|�v�T��q�w���C";
		else if (speed < LOW)
			return "�ثe�C�t�A�|�����q�C";
		else
			return "�ثe���`��p�A�ЫO���Z���C";
	}
}

class CCar implements ILimit, IDistance
{
	private int speed;
	
	CCar(int speed)
	{
		this.speed = speed;
	}
	
	public String Drive()
	{
		if (speed > HIGH)
			return "�ثe���t"+ speed + "km/hr�A�д�t�C";
		else if (speed < LOW)
			return "�ثe���t"+ speed + "km/hr�A�Х[�t�C";
		else
			return "�ثe���t"+ speed + "km/hr�A�ЫO���C";		
	}
	
	public void Process(int min)
	{
		double leng = speed * min /60;
		System.out.println("�w��p"+min+"���A�]�F"+leng+"�����C");
	}
}

public class CH07_10
{

	public static void main(String[] args)
	{
		CTruck t1 = new CTruck(50);
		System.out.println("t1�j����:");
		System.out.println(t1.Drive());
		
		System.out.println();
		
		CCar c1 = new CCar(120);
		System.out.println("c1�p����:");
		System.out.println(c1.Drive());
		c1.Process(2);
	}

}
