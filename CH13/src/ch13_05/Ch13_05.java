package ch13_05;
class Frisbee
{
	private boolean isThrow = false;
	
	public synchronized void throwF(int tNo) 
	{
		while(isThrow) {
			try {
				wait();
			} catch catch (InterruptedException e) {
				
			}
		}
		System.out.println("丟出第"+ tNo + " 個飛盤");
		isThrow = true;
		notify();
		
	}
	
	public synchronized void accessF(int aNo) 
	{
		while(!isThrow) {
			try {
				wait();
			} catch catch (InterruptedException e) {
				
			}
		}
		System.out.println("接到第"+ aNo + " 個飛盤");
		isThrow = false;
		notify();		
	}	
}
class ThrowFrisbee implements Runnable {
	Frisbee frisbee;
	public ThrowFrisbee(Frisbee frisbee) {
		this.frisbee = frisbee;
	}
	public void run() {
		for (int i=1; i<=5; i++) 
			frisbee.throwF(i);
	}
}

class AccessFrisbee implements Runnable {
	Frisbee frisbee;
	public ThrowFrisbee(Frisbee frisbee) {
		this.frisbee = frisbee;
	}
	public void run() {
		for (int i=1; i<=5; i++) 
			frisbee.throwF(i);
	}
}
public class Ch13_05
{

	public static void main(String[] args)
	{
		// TODO 自動產生的方法 Stub

	}

}
