// ��������P�B

package ch13_04;

//�إ߹�@�� Runnable �������l���O GoldClass
class GoldClass implements Runnable
{
	// �ŧi����ܼơA�s��w���쪺������
	int grabed;
	// �ŧi�����ܼơA�s�`������
	static int totalGold = 20000000;
	// �ŧi���������
	Thread t;
	
	// �إߦ��@�Ӥ޼ƪ����O�غc�l
	public GoldClass(String name)
	{
		grabed = 0;
		// �إ߰��������
		t = new Thread(this, name);
		// �Ұʰ����
		t.start();
	}
	// ��@ run() ��k
	public void run()
	{
		// �P�_�`�����O�_�٦���
		while (grabGold() == true)
			// �Y������A���@������
			grabed++;
		// ��ܬY��������������
		System.out.println(t.getName()+"�`�@���o"+ grabed+ "�Ӫ���");
		
		
	}
	// ���]�w�P�B private synchronized static boolean grabGold() 
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
		System.out.println("�@��"+ GoldClass.totalGold + "�Ӫ���");
		GoldClass tA = new GoldClass("�i�T");
		GoldClass tB = new GoldClass("���|");
		GoldClass tC = new GoldClass("����");

	}

}
