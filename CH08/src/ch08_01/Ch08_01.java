package ch08_01;

public class Ch08_01{
	static void Division(double num1, double num2){		// �إ� ��k
		try{
			double num3 = num1 / num2;
			System.out.print(num1 + "/" + num2 + "=" + num3);
		}
		catch (Exception ex){
			System.out.println("���~����:"+ex);
		}
		finally{			
			System.out.println("����finally �϶� \n");
		}
	}
	public static void main(String[] args)
	{
		Division(12, 0);
		Division(12, 2);
	}
}
