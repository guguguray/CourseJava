import java.io.*;

public class CH03_06_Exercise_Q
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��JMichale ���Z���� A B or C: ");
		char st1 = (char)System.in.read();				
		System.out.print("Michale ���Z����: "+ st1 + "\n");

		switch (st1)
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
		System.out.println();
		
		System.out.print("��JJane ���Z���� A B or C: ");
		String st2 = keyin.readLine();
		
		switch (st2)
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
