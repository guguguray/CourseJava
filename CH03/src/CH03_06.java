
public class CH03_06
{

	public static void main(String[] args)
	{
		char math_score = 'A';
		System.out.println("Michale 數學成績為"+ math_score);
		switch (math_score)
		{
			case 'A':
				System.out.println("師長評語:非常好!真是優秀");
				break;
			case 'B':
				System.out.println("師長評語:也不錯，但是可以更好");
				break;			
			case 'C':
				System.out.println("師長評語:真的要多努力");
				break;			
			default:
				System.out.println("師長評語:不要貪玩，為自己多讀點書");
		}
		System.out.println();
		
		math_score = 'C';
		System.out.println("Jane 數學成績為"+ math_score);
		switch (math_score)
		{
			case 'A':
				System.out.println("師長評語:非常好!真是優秀");
				break;
			case 'B':
				System.out.println("師長評語:也不錯，但是可以更好");
				break;			
			case 'C':
				System.out.println("師長評語:真的要多努力");
				break;			
			default:
				System.out.println("師長評語:不要貪玩，為自己多讀點書");
		}
		

	}

}
