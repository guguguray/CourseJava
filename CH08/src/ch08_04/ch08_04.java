package ch08_04;

import java.io.*;

class CCheckNumberException extends NumberFormatException {		// �۩w�q�� class
	CCheckNumberException(String msg) {		// �غc�l
		super(msg);
	}
}

public class ch08_04
{
	
	static void CheckScore(int num) {
		if (num < 0 || num > 100)
			throw new CCheckNumberException("��J���Z�D 0-100");
	}
	
	public static void main(String[] args) throws IOException {
		int score;
		String data;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("��J���Z 0~100 (����J�A������ [Enter]�� ���}):");
			data = keyin.readLine();
			
			if (data.equals(""))
				break;
			
			try {
				score = Integer.parseInt(data);
				if (score < 0 || score > 100) 
					throw new NumberFormatException();				
			}
			catch(CCheckNumberException ex) {
				System.out.println("��J���~: "+ex.getMessage());
				continue;			
			}
			catch(NumberFormatException ex) {
				System.out.println("��J���~: ��J�D���");
				continue;
			}
			System.out.println("�z��J�����Z��:" + score);
		}
		
	}

}
