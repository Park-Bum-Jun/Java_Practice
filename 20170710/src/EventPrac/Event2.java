package EventPrac;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event2 extends JFrame{

	JTextField text;
	JCheckBox bold;
	public Event2()
	{
		super("체크박스에서 Item Event 처리");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		text = new JTextField("JAVA 연습",10);
		text.setFont(new Font("굴림", Font.PLAIN,14));
		c.add(text);
		bold = new JCheckBox("진하게");
		c.add(bold);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		setSize(300,100);
		setVisible(true);
	}
	private class CheckBoxHandler implements ItemListener
	{
		int valBold = Font.PLAIN;
		
		public void itemStateChanged(ItemEvent e){
			if(e.getSource() == bold)
				if(e.getStateChange() == ItemEvent.SELECTED)
					valBold = Font.BOLD;
				else
					valBold = Font.PLAIN;
			text.setFont(new Font("굴림",valBold,14));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Event2 item = new Event2();
			item.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
