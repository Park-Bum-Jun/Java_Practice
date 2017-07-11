package File;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileBackup extends JFrame implements ActionListener {
	JButton backupBtn = null;
	JFileChooser fc = null;

	public FileBackup() {
		super("파일 처리");
		setLayout(new FlowLayout());
		backupBtn = new JButton("백업");

		backupBtn.addActionListener(this);

		add(backupBtn);

		setSize(200, 80);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 버튼의 이벤트 처리 메서드
	public void actionPerformed(ActionEvent e) {
		fc = new JFileChooser();
		int result = fc.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();

			result = JOptionPane.showConfirmDialog(this, f.getName() + " 선택", "파일 확인", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				BufferedReader reader = null;
				BufferedWriter writer = null;
				String str = "";
				try {
					reader = new BufferedReader(new FileReader(f));
					writer = new BufferedWriter(new FileWriter(new File("c:\\" + f.getName())));
					while ((str = reader.readLine()) != null) {
						writer.write(str);
						writer.newLine();
					}
					JOptionPane.showMessageDialog(this, "백업이 성공했습니다.", "작업 성공", JOptionPane.WARNING_MESSAGE);
					reader.close();
					writer.close();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(this, "백업 취소", "파일 선택 오류", JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "백업 취소", "백업 작업 취소", JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String args[]) {
		new FileBackup();
	}
}
