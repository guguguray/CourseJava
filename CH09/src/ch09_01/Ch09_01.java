package ch09_01;

public class Ch09_01
{

	public static void main(String[] args)
	{
		Character ch1 = new Character('A');  // ����
		
		char ch2='b', ch3=' ', ch4='\u3000', ch5='2', ch6='\t', ch7='��'; 
		System.out.println("�r������ch1�O�_���j�g:"+Character.isUpperCase(ch1));
		System.out.println("�r���ܼ�ch2�O�_���p�g:"+Character.isLowerCase(ch2));
		System.out.println("�r���ܼ�ch3�O�_��JAVA���ťզr��:"+Character.isWhitespace(ch3));
		System.out.println("�r���ܼ�ch4�O�_��Unicode���ťզr��:"+Character.isSpaceChar(ch4));
		System.out.println("�r���ܼ�ch5�O�_���r��:"+Character.isLetter(ch5));
		System.out.println("�r���ܼ�ch5�O�_���Ʀr:"+Character.isDigit(ch5));
		System.out.println("�r���ܼ�ch6�O�_������r��:"+Character.isISOControl(ch6));
		System.out.println("�r���ܼ�ch7�O�_���Ʀr�γ�r:"+Character.isLetterOrDigit(ch7));
	}

}
