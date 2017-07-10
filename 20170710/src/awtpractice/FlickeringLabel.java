package awtpractice;

import java.awt.*;

class FlickeringLabel extends Label implements Runnable {
	public FlickeringLabel(String text) {
		super(text);
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n = 0;
		while (true) {
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if (n == 0)
				n = 1;
			else
				n = 0;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class FlickeringLabelEx extends Frame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");

		// 깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜박");
		// 깜박이지 않는 레이블 생성
		Label label = new Label("안깜박");
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		setSize(300, 150);
		setVisible(true);
	}
}

 class fMain {
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
