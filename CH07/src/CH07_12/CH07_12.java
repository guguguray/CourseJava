package CH07_12;

class CTruck 
{
	int HIGH =100;
	int LOW = 60;
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
	
	public void Process(int min)
	{
		System.out.println("�w��p"+(double)(speed*min/60)+"�����C");
	}
}

class CCar 
{
	int HIGH =120;
	int LOW = 60;
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
	
	public void Keep()
	{
		System.out.println("�лP�e���O��"+(int)(speed/2)+"���إH�W�Z���C");
	}
}

public class CH07_12
{
	public static void main(String[] args)
	{
		CTruck t1 = new CTruck(50);		 // �إߪ���
		System.out.println("t1�j����:");
		System.out.println(t1.Drive());  // ��X���� Drive()��k�᪺���G
		t1.Process(15);					 // �����k
		System.out.println();
		
		CCar c1 = new CCar(120);
		System.out.println("c1�p����:");
		System.out.println(c1.Drive());
		c1.Process(10);
		c1.Keep();
	}

}