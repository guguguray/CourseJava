package CH06_01;

class Triangle
{
	// ��Ʀ���
	int base; 
	int height;
	double ans;
	
	// �H�U�T�Ӥ�k����
	void Area()
	{
		ans = (base * height) / 2;
		System.out.println("�b Area ���A��="+base+"�A��="+height+"�A�T���έ��n="+ans+"\n");
	}
	
	double Area_2(int i)
	{
		System.out.print("�b Area_2 ���A��="+base+"�A��="+height+"�A");
		return ans = (i* height)/2;
	}
	
	double Area_3(int i, int j)
	{
		System.out.print("�b Area_3 ���A��="+base+"�A��="+j+ "�A");
		return ans = (i* j)/2;
	}
}

public class CH06_01
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		//����.�ܼ�
		triangle.base = 2;  
		triangle.height = 8;
		
		System.out.println("�bmain���A��="+triangle.base+"�A��="+triangle.height+ "\n");

		System.out.println("����^�ǭȪ���k�A�S���޼�:");
		triangle.Area();			//����.��k()
		
		System.out.println("�qmain���A�ǤJ��@�޼�base,�B�㦳�^�ǭ�:");
		System.out.println("�T���έ��n="+triangle.Area_2(4) + "\n");
		
		System.out.println("�qmain���A�ǤJ��Ӥ޼�base��height,�B�㦳�^�ǭ�:");
		System.out.println("�T���έ��n="+triangle.Area_3(4,10));
		
		

	}

}
