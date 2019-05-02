package ch08_04;

import java.io.*;

class CCheckNumberException extends NumberFormatException {		// 自定義的 class
	CCheckNumberException(String msg) {		// 建構子
		super(msg);
	}
}

public class ch08_04
{
	
	static void CheckScore(int num) {
		if (num < 0 || num > 100)
			throw new CCheckNumberException("輸入成績非 0-100");
	}
	
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
			catch(CCheckNumberException ex) {
				System.out.println("輸入錯誤: "+ex.getMessage());
				continue;			
			}
			catch(NumberFormatException ex) {
				System.out.println("輸入錯誤: 輸入非整數");
				continue;
			}
			System.out.println("您輸入的成績為:" + score);
		}
		
	}

}
