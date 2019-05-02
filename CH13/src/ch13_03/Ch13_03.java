// �޲z���������k

package ch13_03;

//�إ��~�Ӧ� Thread ���l���O MyThread
class MyThread extends Thread
{
	// �Ұʰ����
	public MyThread() {
		start();
	}
	
	//�мg run() ��k
	public void run()
	{
		// �]�����ϥ�sleep() ��k�A�G���f�t try...catch�@�_��
		try {
			for (int i=1; i<=5; i++) {
				// ���o��������󪺦W��
				System.out.println(getName() +"�����:" + "�����" + i+ "��");
				// ������Ȱ�1��
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
		// �Q�� MyThread ���O�A�إ� obT1 ����
		MyThread obT1 = new MyThread();
		// �]�w������W��
		obT1.setName("T1");
		// ���o���b���檺������W��
		System.out.println("�ثe�����:"+ Thread.currentThread().getName());
		// �P�_ obT1 ������O�_�s��
		System.out.println("����� T1�O�_����: " + obT1.isAlive());
		
		// �]���ϥ� join() ��k�A�G�ݭn�f�t try...catch�@�_�ϥ�
		try {
			// �D������|���� obT1��������槹����A���ۦA����D��������򪺵{��
			obT1.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("����� T1�O�_����: " + obT1.isAlive());

	}

}
