package ch09_04;

public class Ch09_04
{

	public static void main(String[] args)
	{
		// �ŧi���ܼƮɡA �|��� heap ���� String pool 
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		
		System.out.println();
		System.out.println(str1.equals(str2));
		
		System.out.println();
		
		// ��� �r�ꪫ�� �P�w�����۵��A�]���ŧi����ɡA�|�Aheap �������P������
		String str3 = new String("Hello"); 
		String str4 = new String("Hello");
		System.out.println(str3 == str4);
		
		System.out.println();
		System.out.println(str3.equals(str4));
	}

}
