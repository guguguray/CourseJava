package CH07_08;

import java.io.*;

class CFruit	// �����O
{
	protected int price;
	
	public int Spend()
	{
		return 0;
	}
}

class CApple extends CFruit  	//�q CFruit �~�ӹL��
{
	private int number;
	
	CApple(int number, int price)
	{
		this.number = number;
		this.price = price;
	}
	public int Spend()
	{
		return number * price;
	}
}

class CTomato extends CFruit	//�q CFruit �~�ӹL��
{
	private float kg;
	
	CTomato (float kg, int price)
	{
		this.kg = kg;
		this.price = price;
	}
	
	public int Spend()
	{
		return (int)(kg * price);
	}
}

class CSum
{
	public static int tot;
	
	public void Total (CFruit f)
	{
		tot += f.Spend();
		System.out.println("�p�p:"+f.Spend()+"��\t\t�֭p:"+tot);
	}
}

public class CH07_08
{

	public static void main(String[] args) throws IOException
	{
		CSum sum = new CSum();
		CApple apple;
		CTomato tomato;
		
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("���⪺�`��? (1:ī�G\t 2:�f�X\t 3:���})");
			String item = keyin.readLine();
			
			if (item.equals("1"))
			{
				System.out.println("�ʶR�X��?");
				int number = Integer.parseInt(keyin.readLine());
				System.out.print("���(��");
				int price = Integer.parseInt(keyin.readLine());
				apple = new CApple (number, price);
				sum.Total(apple);
			}
			else if (item.equals("2"))
			{
				System.out.println("�ʶR�X����?");
				float kg = Float.parseFloat(keyin.readLine());
				System.out.print("���(��");
				int price = Integer.parseInt(keyin.readLine());
				tomato = new CTomato(kg, price);
				sum.Total(tomato);				
			}
			else 
				break;
			System.out.println();
		}
	}

}
