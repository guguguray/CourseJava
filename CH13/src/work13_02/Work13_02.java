/* �ɶ]
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
				System.out.println(Thread.currentThread().getName()+"�]"+ totalSteps + "����(" + i + "��)");
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
		
		Thread runner1 = new Thread(r1, "�@�����");
		Thread runner2 = new Thread(r1, "�G�����");

		runner1.start();
		runner2.start();
		
		try {
			runner1.join();
			runner2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (r1.totalSteps > r2.totalSteps) {
			System.out.println("\n�@��������");
		} 
		else {
			System.out.println("\n�G��������");
		}		
	}
}
