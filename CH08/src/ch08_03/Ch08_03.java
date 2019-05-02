package ch08_03;

import java.io.*;

public class Ch08_03 {

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
			catch(NumberFormatException ex) {
				System.out.println("��J���~");
				continue;
			}
			System.out.println("�z��J�����Z��:" + score);
		}
		
	}
}
