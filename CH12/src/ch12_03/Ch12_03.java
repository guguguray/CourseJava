package ch12_03;

import java.io.*;

public class Ch12_03
{

	public static void main(String[] args)
	{
		// �إ��ɮ׸�Ƨ�����
		File myDir = new File("c:\\javadir");
		myDir.mkdirs();
		
		// �إ��ɮת���
		File childFile = new File(myDir, "stu.txt");
		
		try {
			FileWriter filewrite = new FileWriter(childFile);
			BufferedWriter fileout = new BufferedWriter(filewrite);
			fileout.write("�i�T\t85\t90");
			fileout.newLine();
			fileout.write("���|\t65\t67");
			fileout.newLine();
			fileout.flush();
			filewrite.close();			
			
		} catch (IOException e) {
			System.out.println("�ɮ׳B�z���~!");
		}

	}

}
