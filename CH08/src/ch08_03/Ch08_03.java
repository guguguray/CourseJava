package ch08_03;

import java.io.*;

public class Ch08_03 {

	public static void main(String[] args) throws IOException {
		int score;
		String data;
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("輸入成績 0~100 (不輸入，直接按 [Enter]鍵 離開):");
			data = keyin.readLine();
			
			if (data.equals(""))
				break;
			
			try {
				score = Integer.parseInt(data);
				if (score < 0 || score > 100) 
					throw new NumberFormatException();				
			}
			catch(NumberFormatException ex) {
				System.out.println("輸入錯誤");
				continue;
			}
			System.out.println("您輸入的成績為:" + score);
		}
		
	}
}
