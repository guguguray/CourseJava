/* ��k: 
 * [�׹��l]  [static]	[��ƫ��O] 		[��k�W](Argument) {}
 * public	  �R�A��k	return ���O		
 * private 				�L�Ǧ^��:void
 * protected
 * default
 * 
 * [�׹��l]�i�ٲ��A�ٲ��ɹw�]��default
 * [��ƫ��O] ����Ʀ^�ǮɡA ��k���ԭz������ return 
 */

// �ǭȩI�s  int float double .... ���ݶǭȩI�s
public class CH05_01
{
	// �w�q Money()��k�A�a�J �޼�(p �M  n)�p���ƭȬۭ��� return �ۭ����G 
	static double Money(float p, int n) 	// (�Q�I�s)��޼�
	{
		double m; 	// declare calculator m 
		m = p * n;
		return m; 	// ��^ m ��
	}
	
	//�D�{��
	public static void main(String[] args)
	{
		float price = 2.3f;
		double tot;
		
		// �n���� return �ȡA�ҥH �I�s���覡�n��   �ܼ� = ��k�W(�޼�) 
		tot = Money(price, 11); 	// �I�s Money() ��k�A(��޼�)�ǤJ price, 11 
		System.out.println("tot=" + tot);
	}
}
