package ch09_01;

public class Ch09_01
{

	public static void main(String[] args)
	{
		Character ch1 = new Character('A');  // ン
		
		char ch2='b', ch3=' ', ch4='\u3000', ch5='2', ch6='\t', ch7='い'; 
		System.out.println("じンch1琌糶:"+Character.isUpperCase(ch1));
		System.out.println("じ跑计ch2琌糶:"+Character.isLowerCase(ch2));
		System.out.println("じ跑计ch3琌JAVAフじ:"+Character.isWhitespace(ch3));
		System.out.println("じ跑计ch4琌Unicodeフじ:"+Character.isSpaceChar(ch4));
		System.out.println("じ跑计ch5琌ダ:"+Character.isLetter(ch5));
		System.out.println("じ跑计ch5琌计:"+Character.isDigit(ch5));
		System.out.println("じ跑计ch6琌铬叉じ:"+Character.isISOControl(ch6));
		System.out.println("じ跑计ch7琌计┪虫:"+Character.isLetterOrDigit(ch7));
	}

}
