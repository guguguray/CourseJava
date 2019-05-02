// create 資料夾

package ch12_01;

import java.io.File;

public class Ch12_01
{

	public static void main(String[] args)
	{
		// 定義變數
		String path_name = "c:\\javadir";
		
		// 宣告 File 物件
		File myDir = new File(path_name);
		
		// 檢查資料夾是否存在
		if (myDir.exists())
			System.out.println(path_name + "已經存在");
		else
			System.out.println(path_name + "尚未建立");
		
		// 檢查資料夾建立是否成功
		if (myDir.mkdir())
			System.out.println(path_name + "資料夾建立成功");
		else
			System.out.println(path_name + "資料夾建立失敗");

	}

}
