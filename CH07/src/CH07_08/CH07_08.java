package CH07_08;

import java.io.*;

class CFruit	// 父類別
{
	protected int price;
	
	public int Spend()
	{
		return 0;
	}
}

class CApple extends CFruit  	//從 CFruit 繼承過來
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

class CTomato extends CFruit	//從 CFruit 繼承過來
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
		System.out.println("小計:"+f.Spend()+"元\t\t累計:"+tot);
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
			System.out.println("結算的總類? (1:蘋果\t 2:番茄\t 3:離開)");
			String item = keyin.readLine();
			
			if (item.equals("1"))
			{
				System.out.println("購買幾顆?");
				int number = Integer.parseInt(keyin.readLine());
				System.out.print("單價(元");
				int price = Integer.parseInt(keyin.readLine());
				apple = new CApple (number, price);
				sum.Total(apple);
			}
			else if (item.equals("2"))
			{
				System.out.println("購買幾公斤?");
				float kg = Float.parseFloat(keyin.readLine());
				System.out.print("單價(元");
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
