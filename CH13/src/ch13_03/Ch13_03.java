// 管理執行緒的方法

package ch13_03;

//建立繼承自 Thread 的子類別 MyThread
class MyThread extends Thread
{
	// 啟動執行緒
	public MyThread() {
		start();
	}
	
	//覆寫 run() 方法
	public void run()
	{
		// 因為有使用sleep() 方法，故須搭配 try...catch一起用
		try {
			for (int i=1; i<=5; i++) {
				// 取得執行緒物件的名稱
				System.out.println(getName() +"執行緒:" + "執行第" + i+ "次");
				// 執行緒暫停1秒
				sleep(1000);								
			}
		} catch (InterruptedException e) {
			
		}
		
	}
	
}

public class Ch13_03
{

	public static void main(String[] args)
	{
		// 利用 MyThread 類別，建立 obT1 物件
		MyThread obT1 = new MyThread();
		// 設定執行緒名稱
		obT1.setName("T1");
		// 取得正在執行的執行緒名稱
		System.out.println("目前執行緒:"+ Thread.currentThread().getName());
		// 判斷 obT1 執行緒是否存活
		System.out.println("執行緒 T1是否活著: " + obT1.isAlive());
		
		// 因為使用 join() 方法，故需要搭配 try...catch一起使用
		try {
			// 主執行緒會等到 obT1執行緒執行完畢後，接著再執行主執行緒後續的程式
			obT1.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("執行緒 T1是否活著: " + obT1.isAlive());

	}

}
