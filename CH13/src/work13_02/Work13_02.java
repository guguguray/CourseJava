/* 賽跑
 * 
 */
package work13_02;

class Runner implements Runnable
{
	public int totalSteps;
	
	public void run()
	{
		try {
			for (int i=1; i<=10; i++) {
				int steps = (int)((Math.random()*9)+1);
				totalSteps += steps;
				System.out.println(Thread.currentThread().getName()+"跑"+ totalSteps + "公尺(" + i + "秒)");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Work13_02
{

	public static void main(String[] args)
	{
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		
		Thread runner1 = new Thread(r1, "一號選手");
		Thread runner2 = new Thread(r1, "二號選手");

		runner1.start();
		runner2.start();
		
		try {
			runner1.join();
			runner2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (r1.totalSteps > r2.totalSteps) {
			System.out.println("\n一號選手獲勝");
		} 
		else {
			System.out.println("\n二號選手獲勝");
		}		
	}
}
