package ch12_02;

import java.io.*;

public class Ch12_02
{

	public static void main(String[] args)
	{
		// �w�q�ܼ�
				String file_name = "c:\\javadir\\javatext.txt";
				
				// �ŧi File ����
				File myFile = new File(file_name);
				
				// �ˬd��Ƨ��O�_�s�b
				if (myFile.exists())
					System.out.println(file_name + "�w�g�s�b");
				else
					System.out.println(file_name + "�|���إ�");
				
				// �ˬd��Ƨ��إ߬O�_���\
				
				try {
					if (myFile.createNewFile())
						System.out.println(file_name + "��Ƨ��إߦ��\");
					else
						System.out.println(file_name + "��Ƨ��إߥ���");
					
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.println("\n�ɮת��󪺦W�٬�"+myFile.getName());
				System.out.println("\n�ɮת��󪺤����|��"+myFile.getParent());
				System.out.println("\n�ɮת��󪺵�����|��"+myFile.getPath());
				System.out.println("\n�ɮת���i�_Ū��"+myFile.canRead());
				System.out.println("\n�ɮת���i�_�g�J"+myFile.canWrite());
				System.out.println("\n�ɮת���i�_�Q����"+myFile.isHidden());
				System.out.println("\n�ק��ɮת���g�J���v��....");
				
				myFile.setWritable(false);
				System.out.println("\n�ɮת���i�_�g�J"+myFile.canWrite());
	}

}
