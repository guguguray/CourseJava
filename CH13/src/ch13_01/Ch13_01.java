// �~�� Thread ���O�إ߰����

package ch13_01;

// �إ��~�Ӧ� Thread ���l���O CAddThread
class CAddThread extends Thread
{
	//�мg run() ��k
	public void run()
	{
		int sum1=0, sum2;
		
		// �֥[2�A���� 5�� 
		for (int i=1; i<=5; i++) {
			sum2 = sum1 +2;
			System.out.println("�֥[�����:" + sum1 + "+2=" + sum2);
			System.out.println("==============================");
			sum1 = sum2;
			try {
				// �ϰ�������� 0~1���A���T�w�ɶ�
				Thread.sleep((long) (1000*Math.random()));
			} 
			catch (InterruptedException e){
				
			}					
		}
	}	
}

//�إ��~�Ӧ� Thread ���l���O CFactThread
class CFactThread extends Thread
{
	//�мg run() ��k
	public void run()
	{
		// �p�� 5! (5����) 
		for (int i=1; i<=5; i++) {
			int fact = 1;
			for (int j=1; j<=i; j++)
				fact *= j;
			
			System.out.println("���������:" + i + "!=" + fact);
			
			try {
				// �ϰ�������� 0~1���A���T�w�ɶ�
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
		// �Q�����O����ӫغc�l�A�إߦU�۪�����
		CAddThread add_thread = new CAddThread();
		CFactThread fact_thread = new CFactThread();
		
		// �Ұʪ��󪺰����
		add_thread.start();
		fact_thread.start();
	}

}
