import java.io.*;

public class CH03_06_Exercise_Q
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("輸入Michale 成績等級 A B or C: ");
		char st1 = (char)System.in.read();				
		System.out.print("Michale 成績等級: "+ st1 + "\n");

		switch (st1)
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
		
		System.out.print("輸入Jane 成績等級 A B or C: ");
		String st2 = keyin.readLine();
		
		switch (st2)
		{
			case "A":
				System.out.println("師長評語:非常好!真是優秀");
				break;
			case "B":
				System.out.println("師長評語:也不錯，但是可以更好");
				break;			
			case "C":
				System.out.println("師長評語:真的要多努力");
				break;			
			default:
				System.out.println("師長評語:不要貪玩，為自己多讀點書");
		}
		

	}

}
