// create ��Ƨ�

package ch12_01;

import java.io.File;

public class Ch12_01
{

	public static void main(String[] args)
	{
		// �w�q�ܼ�
		String path_name = "c:\\javadir";
		
		// �ŧi File ����
		File myDir = new File(path_name);
		
		// �ˬd��Ƨ��O�_�s�b
		if (myDir.exists())
			System.out.println(path_name + "�w�g�s�b");
		else
			System.out.println(path_name + "�|���إ�");
		
		// �ˬd��Ƨ��إ߬O�_���\
		if (myDir.mkdir())
			System.out.println(path_name + "��Ƨ��إߦ��\");
		else
			System.out.println(path_name + "��Ƨ��إߥ���");

	}

}
