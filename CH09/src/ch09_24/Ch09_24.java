package ch09_24;

import java.util.*;

public class Ch09_24
{

	public static void main(String[] args)
	{
		Calendar Cal = Calendar.getInstance();
		System.out.println(Cal);
		
		System.out.println("\n"+Cal.get(Calendar.YEAR)+"�~");
		System.out.println(Cal.get(Calendar.MONTH)+"��");
		System.out.println(Cal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(Cal.get(Calendar.HOUR)+"��");
		System.out.println(Cal.get(Calendar.MINUTE)+"��");
		System.out.println(Cal.get(Calendar.SECOND)+"��");
		System.out.println(Cal.get(Calendar.AM_PM)==0?"�W��":"�U��");
		System.out.println(Cal.get(Calendar.MILLISECOND)+"�@��");
		
		System.out.println("\n���g�O�Ӧ~����"+Cal.get(Calendar.WEEK_OF_YEAR)+"�g");
		System.out.println("���g�O�Ӥ몺��"+Cal.get(Calendar.WEEK_OF_MONTH)+"�g");
		
		System.out.println("\n����O�Ӧ~����"+Cal.get(Calendar.DAY_OF_YEAR)+"��");
		System.out.println("����O�Ӥ몺��"+Cal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println("����O�Ӷg����"+Cal.get(Calendar.DAY_OF_WEEK)+"��");
		
		System.out.println("\n�{�b������ɶ�:"+Cal.getTime());	// ���`�Ϊ��覡
		System.out.println("�ثe���ɶ��W�O:"+Cal.getTimeInMillis());	 // ���`�Ϊ��覡

	}

}
