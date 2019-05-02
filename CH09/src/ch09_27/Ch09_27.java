package ch09_27;

import java.text.*;

public class Ch09_27
{

	public static void main(String[] args)
	{
		double d1 = 12345.765;
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		
		System.out.println("��Ʀr�榡:"+ d1);
		
		System.out.print("\n�H�t�ιw�]���q�ή榡�A�榡�ƼƦr:");
		System.out.println(nf1.format(d1));
		System.out.print("\n�H�t�ιw�]���f���榡�A�榡�ƼƦr:");
		System.out.println(nf2.format(d1));
		System.out.print("\n�H�t�ιw�]����Ʈ榡�A�榡�ƼƦr:");
		System.out.println(NumberFormat.getIntegerInstance().format(d1));
		System.out.print("\n�H�t�ιw�]���ʤ���覡�A�榡�ƼƦr:");
		System.out.println(NumberFormat.getPercentInstance().format(d1));
		
		nf1.setMaximumFractionDigits(2);
		System.out.print("\n�H�̦h���p�ƨ��覡�A�榡�ƼƦr:");
		System.out.println(nf1.format(d1));
		
		nf1.setMaximumIntegerDigits(2);
		System.out.print("\n�H�̦h����ƨ��覡�A�榡�ƼƦr:");
		System.out.println(nf1.format(d1));
		

	}

}
