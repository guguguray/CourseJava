package ch09_15;

public class Ch09_15
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println("��l�r��:" + sb1);
		
		char[] ch = {'�r','��','�w','��','��'};
		
		sb1.append(ch, 2, 3);
		System.out.println("\n�s�W�r��}�C:" + sb1);
		
		sb1.append("�Ш|���");
		System.out.println("\n�s�W�r��:" + sb1);
		
		sb1.insert(7, "�P");
		System.out.println("\n���J�r��:" + sb1);
		
		int num = 2;
		sb1.insert(4, num);
		System.out.println("\n���J�Ʀr:" + sb1);
		
		sb1.delete(6, 9);
		System.out.println("\n�R���r��:" + sb1);
		
		sb1.deleteCharAt(5);
		System.out.println("\n�R����6�Ӧr��:" + sb1);
		
		sb1.replace(5, 9, "���N�r��");
		System.out.println("\n���N�r��:" + sb1);
		
		sb1.setCharAt(4, '-');
		System.out.println("\n�]�w�r��:" + sb1);
		
		sb1.reverse();
		System.out.println("\n�r�����:" + sb1);
	}

}
