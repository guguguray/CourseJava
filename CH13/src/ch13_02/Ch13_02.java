// ��@  Runnable �����إ߰����
package ch13_02;

// �إ߹�@�� Runnable �������l���O CAddThread
class CAddThread implements Runnable
{
	private String thread_name;
	private int num;
	
	// �إߦ���ӰѼƪ����O�غc�l
	CAddThread(String name, int n)
	{
		thread_name = name;
		num = n;
	}
	
	//��@ Run() ��k
	public void run()
	{
		int sum1=0, sum2;
		
		//����֥[ n�A�@����
		for (int i=1; i<=5; i++) {
			sum2 = sum1 +2;
			
			System.out.println(thread_name + sum1 + "+ " + num + "=" + sum2);
			
			if (num==2)
				System.out.println("==============================");
			
			sum1 = sum2;
			try {
				// �ϰ�������� 0~1���A���T�w�ɶ�
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
		// �Q�ζǤJ��ӰѼƪ����O�غc�l�A�إߨ�Ӫ���
		CAddThread thread1 = new CAddThread("�֥[2�����:", 2);
		CAddThread thread2 = new CAddThread("�֥[5�����:", 5);
		
		// ��Ӱ�������� �|�U�� ����ۤv����������e�A�������z�Z
		Thread add2_thread = new Thread(thread1);
		Thread add5_thread = new Thread(thread2);
		
		// �Ұʪ��󪺰����
		add2_thread.start();
		add5_thread.start();
	}

}
