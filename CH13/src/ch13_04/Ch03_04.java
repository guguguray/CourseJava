// 執行緒的同步

package ch13_04;

//建立實作自 Runnable 介面的子類別 GoldClass
class GoldClass implements Runnable
{
	// 宣告整數變數，存放已偷到的金塊數
	int grabed;
	// 宣告全域變數，存總金塊數
	static int totalGold = 20000000;
	// 宣告執行緒物件
	Thread t;
	
	// 建立有一個引數的類別建構子
	public GoldClass(String name)
	{
		grabed = 0;
		// 建立執行緒物件
		t = new Thread(this, name);
		// 啟動執行緒
		t.start();
	}
	// 實作 run() 方法
	public void run()
	{
		// 判斷總金塊是否還有剩
		while (grabGold() == true)
			// 某執行緒，偷一塊金塊
			grabed++;
		// 顯示某執行緒偷到金塊數
		System.out.println(t.getName()+"總共偷得"+ grabed+ "個金塊");
		
		
	}
	// 應設定同步 private synchronized static boolean grabGold() 
	private synchronized static boolean grabGold() {
		if (totalGold > 0) {
			totalGold--;
			return true;
		}
		else {
			return false;
		}
	}
}

public class Ch03_04
{

	public static void main(String[] args)
	{
		System.out.println("共有"+ GoldClass.totalGold + "個金塊");
		GoldClass tA = new GoldClass("張三");
		GoldClass tB = new GoldClass("李四");
		GoldClass tC = new GoldClass("王五");

	}

}
