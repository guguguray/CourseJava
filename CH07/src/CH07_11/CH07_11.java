package CH07_11;

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

// 介面繼承來自 上面 ILimit & IDistance
interface ISpeed extends ILimit, IDistance
{
	void keep();
}

// 實作上面三個 interface
class CTruck implements ILimit, IDistance
{
	private int speed;
	
	CTruck(int speed)
	{
		this.speed = speed;
	}
	
	public String Drive()
	{
		if (speed > HIGH)
			return "目前超速，會影響交通安全。";
		else if (speed < LOW)
			return "目前低速，會阻塞交通。";
		else
			return "目前正常行駛，請保持距離。";
	}
	public void Process(int min)
	{
		System.out.println("已行駛了"+(double)(speed*min/60)+"公里。");
	}
}

class CCar implements ISpeed
{
	private int speed;
	
	CCar(int speed)
	{
		this.speed = speed;
	}
	
	public String Drive()
	{
		if (speed > HIGH)
			return "目前車速"+ speed + "km/hr，請減速。";
		else if (speed < LOW)
			return "目前車速"+ speed + "km/hr，請加速。";
		else
			return "目前車速"+ speed + "km/hr，請保持。";		
	}
	
	public void Process(int min)
	{
		double leng = speed * min /60;
		System.out.println("已行駛"+min+"分，跑了"+leng+"公里。");
	}
	
	public void Keep()
	{
		System.out.println("請與前車保持"+(int)(speed/2)+"公尺以上距離。");
	}
}

public class CH07_11
{
	public static void main(String[] args)
	{
		CTruck t1 = new CTruck(50);
		System.out.println("t1大型車:");
		System.out.println(t1.Drive());
		t1.Process(15);
		
		System.out.println();
		
		CCar c1 = new CCar(120);
		System.out.println("c1小型車:");
		System.out.println(c1.Drive());
		c1.Process(10);
		c1.Keep();
	}

}
