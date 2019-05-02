import java.io.*;

public class CH03_06_Exercise
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請選擇輸入的是字元(1)或字串(2): ");
		int choise = Integer.parseInt(keyin.readLine()); 
		
		if (choise == 1)
		{
			System.out.print("輸入Michale 成績等級 A B or C: ");
			char math_score = (char)System.in.read();				
			System.out.print("Michale 成績等級: "+ math_score + "\n");

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
		else
		{
			System.out.print("輸入Michale 成績等級 A B or C: ");
			String math_score = keyin.readLine();
			
			switch (math_score)
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

}
