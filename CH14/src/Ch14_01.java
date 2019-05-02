import java.awt.*;
import javax.swing.*;

public class Ch14_01 extends JApplet
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Hello World", 100, 50);
	}
}

