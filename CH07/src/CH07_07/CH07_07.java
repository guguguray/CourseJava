// 物件參照
package CH07_07;
import java.io.*;

class CPlayer // 父類別: 訂規範
{
	public void Show()
	{
		
	}
}

class CCD extends CPlayer // 子類別 繼承至 父類別
{
	public void Show()
	{
		System.out.println("現在正播放[音樂CD]");
	}
}
class CDVD extends CPlayer
{
	public void Show()
	{
		System.out.println("現在正播放[影片DVD]");
	}
}

public class CH07_07
{

	public static void main(String[] args) throws IOException
	{
		CPlayer play = new CPlayer();
		CCD cd = new CCD();
		CDVD dvd = new CDVD();
		
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			System.out.println("請輸入 CD or DVD?");
			String item = keyin.readLine();
			if (item.equals("CD") || item.equals("cd"))
				play = cd;
			else if (item.equals("DVD") || item.equals("dvd"))
				play = dvd;
			else
				continue;
			play.Show();
			break;
		}

	}

}
