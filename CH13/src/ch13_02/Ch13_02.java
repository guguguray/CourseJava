// 實作  Runnable 介面建立執行緒
package ch13_02;

// 建立實作自 Runnable 介面的子類別 CAddThread
class CAddThread implements Runnable
{
	private String thread_name;
	private int num;
	
	// 建立有兩個參數的類別建構子
	CAddThread(String name, int n)
	{
		thread_name = name;
		num = n;
	}
	
	//實作 Run() 方法
	public void run()
	{
		int sum1=0, sum2;
		
		//執行累加 n，共五次
		for (int i=1; i<=5; i++) {
			sum2 = sum1 +2;
			
			System.out.println(thread_name + sum1 + "+ " + num + "=" + sum2);
			
			if (num==2)
				System.out.println("==============================");
			
			sum1 = sum2;
			try {
				// 使執行緒延遲 0~1秒內，不固定時間
				Thread.sleep((long)(1000*Math.random()));
			} 
			catch (InterruptedException e){				
			}					
		}
	}	
}

public class Ch13_02
{

	public static void main(String[] args)
	{
		// 利用傳入兩個參數的類別建構子，建立兩個物件
		CAddThread thread1 = new CAddThread("累加2執行緒:", 2);
		CAddThread thread2 = new CAddThread("累加5執行緒:", 5);
		
		// 兩個執行緒物件 會各自 執行自己的執行緒內容，彼此不干擾
		Thread add2_thread = new Thread(thread1);
		Thread add5_thread = new Thread(thread2);
		
		// 啟動物件的執行緒
		add2_thread.start();
		add5_thread.start();
	}

}
