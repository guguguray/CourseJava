// 繼承 Thread 類別建立執行緒

package ch13_01;

// 建立繼承自 Thread 的子類別 CAddThread
class CAddThread extends Thread
{
	//覆寫 run() 方法
	public void run()
	{
		int sum1=0, sum2;
		
		// 累加2，執行 5次 
		for (int i=1; i<=5; i++) {
			sum2 = sum1 +2;
			System.out.println("累加執行緒:" + sum1 + "+2=" + sum2);
			System.out.println("==============================");
			sum1 = sum2;
			try {
				// 使執行緒延遲 0~1秒內，不固定時間
				Thread.sleep((long) (1000*Math.random()));
			} 
			catch (InterruptedException e){
				
			}					
		}
	}	
}

//建立繼承自 Thread 的子類別 CFactThread
class CFactThread extends Thread
{
	//覆寫 run() 方法
	public void run()
	{
		// 計算 5! (5階乘) 
		for (int i=1; i<=5; i++) {
			int fact = 1;
			for (int j=1; j<=i; j++)
				fact *= j;
			
			System.out.println("階乘執行緒:" + i + "!=" + fact);
			
			try {
				// 使執行緒延遲 0~1秒內，不固定時間
				Thread.sleep((long)(1000*Math.random()));
			} catch (InterruptedException e) {
				
			}					
		}
	}	
}

public class Ch13_01
{

	public static void main(String[] args)
	{
		// 利用類別的兩個建構子，建立各自的物件
		CAddThread add_thread = new CAddThread();
		CFactThread fact_thread = new CFactThread();
		
		// 啟動物件的執行緒
		add_thread.start();
		fact_thread.start();
	}

}
