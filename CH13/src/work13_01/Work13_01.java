package work13_01;

class ATM extends Thread
{
	Account account;
	long money;	
	
	public ATM(Account ac, long n) {
		this.account = ac;
		this.money = n;
	}
	
	public void run() {
		account.deposit(money);		
	}
}

class Account 
{
	long balance;
	
	public Account(long balance) {
		this.balance = balance;
	}
	
	public synchronized void deposit(long amount) 
	{
		long d_balance;
		d_balance = this.balance;
		System.out.println("�b�᤺�l�B=" + d_balance);
		
		if (amount >=0) {
			System.out.println("�s�ڼW�[��=" + amount);
		}
		else {
			System.out.println("�s�ڴ�ּ�=" + amount);
		}
		System.out.println("�����......");
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		d_balance += amount;
		if (d_balance >=0) {
			System.out.println("�ثe�b��l�B="+ d_balance +"\n");
			this.balance = d_balance;
		}
		else {
			System.out.println("�b��l�B����!\n");
		}		
	}
}

public class Work13_01
{

	public static void main(String[] args)
	{
		Account account = new Account(5000);
		ATM A1 = new ATM(account, -1000);
		ATM A2 = new ATM(account, 2000);
		ATM A3 = new ATM(account, -9000);
		A1.start();
		A2.start();
		A3.start();
		try {
			A1.join();
			A2.join();
			A3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�̫�b��l�B:"+account.balance);

	}

}
