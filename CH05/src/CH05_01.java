/* 方法: 
 * [修飾子]  [static]	[資料型別] 		[方法名](Argument) {}
 * public	  靜態方法	return 型別		
 * private 				無傳回值:void
 * protected
 * default
 * 
 * [修飾子]可省略，省略時預設為default
 * [資料型別] 有資料回傳時， 方法的敘述內須有 return 
 */

// 傳值呼叫  int float double .... 皆屬傳值呼叫
public class CH05_01
{
	// 定義 Money()方法，帶入 引數(p 和  n)計算兩數值相乘後 return 相乘結果 
	static double Money(float p, int n) 	// (被呼叫)虛引數
	{
		double m; 	// declare calculator m 
		m = p * n;
		return m; 	// 返回 m 值
	}
	
	//主程式
	public static void main(String[] args)
	{
		float price = 2.3f;
		double tot;
		
		// 要接收 return 值，所以 呼叫的方式要用   變數 = 方法名(引數) 
		tot = Money(price, 11); 	// 呼叫 Money() 方法，(實引數)傳入 price, 11 
		System.out.println("tot=" + tot);
	}
}
