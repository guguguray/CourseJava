package ch08_02;

public class Ch08_02 {
	static void Division(int num1, double num2) {		// 建立 方法
		try {
			if (num2 ==0) {
				throw new ArithmeticException("除數為浮點數0.0");
			}
			double num3 = num1 / num2;
			System.out.print(num1 + "/" + num2 + "=" + num3);
		}
		catch (ArithmeticException ex) {
			System.out.println("錯誤類型:"+ex.getMessage());
		}
		finally {			
			System.out.println("執行finally 區塊 \n");
		}
	}
	public static void main(String[] args) {
		Division(12, 0.0);
		Division(12, 2);
	}
}
