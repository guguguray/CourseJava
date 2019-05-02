package work12_01;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class Cnotepad extends JFrame implements ActionListener
{
	private JPanel panel;
	private JMenuItem item1, item2, item3, item4;
	private JTextArea txtNote = new JTextArea(20, 50);
	private FileDialog fileDialog;
	private File myFile;
	private String file_dir, file_name;

	Cnotepad()
	{
		panel = new JPanel();
		add(panel);

		JMenuBar munBar = new JMenuBar();
		add(munBar, BorderLayout.NORTH);

		JMenu menu1 = new JMenu("檔案（F）");
		menu1.setMnemonic(KeyEvent.VK_F);
		munBar.add(menu1);

		item1 = new JMenuItem("開新檔案（N）");
		item1.setMnemonic(KeyEvent.VK_N);
		item1.addActionListener(this);
		menu1.add(item1);

		item2 = new JMenuItem("開啟舊檔（O）");
		item2.setMnemonic(KeyEvent.VK_O);
		item2.addActionListener(this);
		menu1.add(item2);

		item3 = new JMenuItem("儲存檔案（S）");
		item3.setMnemonic(KeyEvent.VK_S);
		item3.addActionListener(this);
		menu1.add(item3);

		menu1.addSeparator();

		item4 = new JMenuItem("結束（X）");
		item4.setMnemonic(KeyEvent.VK_X);
		item4.addActionListener(this);
		menu1.add(item4);

		Font txtF = new Font("新細明體", Font.PLAIN, 16);
		txtNote.setFont(txtF);

		JScrollPane span = new JScrollPane(txtNote, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		span.setLocation(0, 0);
		add(span);

		setTitle("記事本");
		setBounds(100, 100, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == item1)
			txtNote.setText("");

		if (e.getSource() == item2)
		{
			fileDialog = new FileDialog(this, "開啟舊檔", FileDialog.LOAD);
			fileDialog.setVisible(true);

			String file_dir = fileDialog.getDirectory();
			String file_name = fileDialog.getFile();

			myFile = new File(file_dir + file_name);

			txtNote.setText("");

			String loadData = "";

			try
			{
				FileReader fileread = new FileReader(myFile);
				BufferedReader filein = new BufferedReader(fileread);

				do
				{
					loadData = filein.readLine();
					if (loadData == null)
						break;

					txtNote.setLineWrap(true);
					loadData += "\n";
					txtNote.append(loadData);
				}
				while (true);

				fileread.close();
			}
			catch (IOException ex)
			{
				JOptionPane.showMessageDialog(null, "檔案處理有誤！", "錯誤", 
						JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getSource() == item3)
		{
			String saveData = "";

			fileDialog = new FileDialog(this, "儲存檔案", FileDialog.SAVE);
			fileDialog.setVisible(true);

			String file_dir = fileDialog.getDirectory();
			String file_name = fileDialog.getFile();

			File myDir = new File(file_dir);
			myDir.mkdirs();

			File childFile = new File(myDir, file_name);

			try
			{
				FileWriter filewrite = new FileWriter(childFile);
				BufferedWriter fileout = new BufferedWriter(filewrite);
				txtNote.setLineWrap(true);
				saveData = txtNote.getText();
				fileout.write(saveData);
				fileout.flush();
				filewrite.close();
			}
			catch (IOException ex)
			{
				JOptionPane.showMessageDialog(null, "檔案處理有誤！", "錯誤", 
						JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getSource() == item4)
			System.exit(0);

		repaint();
	}
}

public class Work12_01
{

	public static void main(String[] args)
	{
		new Cnotepad();

	}

}
