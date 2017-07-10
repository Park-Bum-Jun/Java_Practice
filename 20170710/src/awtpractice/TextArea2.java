package awtpractice;

import java.awt.*;

class TextArea2 extends Frame {
	public TextArea2(String str) {
		super(str);
		Panel p = new Panel();
		TextArea txt1 = new TextArea(10, 30);
		TextField txt2 = new TextField("Hello Java", 20);
		txt1.setText("JAVA WORLD");
		txt1.setBackground(Color.YELLOW);
		txt1.setFont(new Font("궁서체", Font.BOLD, 10));
		txt1.setForeground(Color.red);
		txt2.setEchoChar('@');
		txt2.setForeground(Color.red);
		p.add(txt1);
		p.add(txt2);
		add(p);
		setSize(200, 200);
		setVisible(true);
	}

}

class tMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextArea2("Text 테스트");
	}
}