package Swing;

import javax.swing.*;

public class JButtonTest extends JFrame {
	public JButtonTest() {
		super("버튼 테스트");
		JPanel buttonPanel = new JPanel();
		JButton btn = new JButton("Button");
		buttonPanel.add(btn);

		ImageIcon icon1 = new ImageIcon(".\\src\\btn_01.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\btn_02.png");
		JToggleButton tgbutton = new JToggleButton(icon1);
		tgbutton.setPressedIcon(icon2);
		buttonPanel.add(tgbutton);

		JLabel lblHobby = new JLabel("취미");
		JCheckBox check1 = new JCheckBox("운동");
		JCheckBox check2 = new JCheckBox("독서");
		JCheckBox check3 = new JCheckBox("영화감상");
		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);

		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
		JLabel lblMale = new JLabel("성별");
		JRadioButton rb1 = new JRadioButton("남자");
		JRadioButton rb2 = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		buttonPanel.add(lblMale);
		buttonPanel.add(rb1);
		buttonPanel.add(rb2);

		add(buttonPanel);

		setLocation(150, 200);
		setSize(242, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonTest();
	}

}

