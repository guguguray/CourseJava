import java.io.*;

public class CH03_06_Exercise
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�ܿ�J���O�r��(1)�Φr��(2): ");
		int choise = Integer.parseInt(keyin.readLine()); 
		
		if (choise == 1)
		{
			System.out.print("��JMichale ���Z���� A B or C: ");
			char math_score = (char)System.in.read();				
			System.out.print("Michale ���Z����: "+ math_score + "\n");

			switch (math_score)
			{
				case 'A':
					System.out.println("�v�����y:�D�`�n!�u�O�u�q");
					break;
				case 'B':
					System.out.println("�v�����y:�]�����A���O�i�H��n");
					break;			
				case 'C':
					System.out.println("�v�����y:�u���n�h�V�O");
					break;			
				default:
					System.out.println("�v�����y:���n�g���A���ۤv�hŪ�I��");
			}
		}
		else
		{
			System.out.print("��JMichale ���Z���� A B or C: ");
			String math_score = keyin.readLine();
			
			switch (math_score)
			{
				case "A":
					System.out.println("�v�����y:�D�`�n!�u�O�u�q");
					break;
				case "B":
					System.out.println("�v�����y:�]�����A���O�i�H��n");
					break;			
				case "C":
					System.out.println("�v�����y:�u���n�h�V�O");
					break;			
				default:
					System.out.println("�v�����y:���n�g���A���ۤv�hŪ�I��");
			}		
		}	

	}

}
