package ch12_02;

import java.io.*;

public class Ch12_02
{

	public static void main(String[] args)
	{
		// 定義變數
				String file_name = "c:\\javadir\\javatext.txt";
				
				// 宣告 File 物件
				File myFile = new File(file_name);
				
				// 檢查資料夾是否存在
				if (myFile.exists())
					System.out.println(file_name + "已經存在");
				else
					System.out.println(file_name + "尚未建立");
				
				// 檢查資料夾建立是否成功
				
				try {
					if (myFile.createNewFile())
						System.out.println(file_name + "資料夾建立成功");
					else
						System.out.println(file_name + "資料夾建立失敗");
					
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.println("\n檔案物件的名稱為"+myFile.getName());
				System.out.println("\n檔案物件的父路徑為"+myFile.getParent());
				System.out.println("\n檔案物件的絕對路徑為"+myFile.getPath());
				System.out.println("\n檔案物件可否讀取"+myFile.canRead());
				System.out.println("\n檔案物件可否寫入"+myFile.canWrite());
				System.out.println("\n檔案物件可否被隱藏"+myFile.isHidden());
				System.out.println("\n修改檔案物件寫入的權限....");
				
				myFile.setWritable(false);
				System.out.println("\n檔案物件可否寫入"+myFile.canWrite());
	}

}
