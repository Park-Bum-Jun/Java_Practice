package EventPrac;

import javax.swing.*;

public class JMenuTest extends JFrame{

	private JRadioButtonMenuItem colorItems[],fonts[];
	private JCheckBoxMenuItem styleItems[];
	private ButtonGroup fontGroup, colorGroup;
	
	public JMenuTest()
	{
		super("JMenu 테스트");
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JMenu fileMenu = new JMenu("파일(F)");
		fileMenu.setToolTipText("파일메뉴입니다.");
		fileMenu.setMnemonic('F');
		
		JMenuItem newItem = new JMenuItem("새파일(N)");
		newItem.setMnemonic('N');
		fileMenu.add(newItem);
		JMenuItem openItem = new JMenuItem("열기(O)");
		openItem.setMnemonic('O');
		fileMenu.add(openItem);
		JMenuItem saveItem = new JMenuItem("저장(S)");
		saveItem.setMnemonic('S');
		fileMenu.add(saveItem);
		JMenuItem exitItem = new JMenuItem("닫기(X)");
		exitItem.setMnemonic('X');
		fileMenu.add(exitItem);
		bar.add(fileMenu);
		
		JMenu formatMenu = new JMenu("편집(E)");
		formatMenu.setToolTipText("편집메뉴입니다.");
		formatMenu.setMnemonic('E');
		String colors[]={"검정","파랑","빨강","초록"};
		JMenu colorMenu = new JMenu("색상(C)");
		colorMenu.setMnemonic('C');
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorGroup = new ButtonGroup();
		for(int i=0; i<colors.length; i++)
		{
			colorItems[i] = new JRadioButtonMenuItem(colors[i]);
			colorMenu.add(colorItems[i]);
			colorGroup.add(colorItems[i]);
		}
		colorItems[0].setSelected(true);
		formatMenu.add(colorMenu);
		formatMenu.addSeparator();
		
		String fontNames[] = {"굴림","바탕","고딕"};
		JMenu fontMenu = new JMenu("글꼴(T)");
		fontMenu.setMnemonic('T');
		fonts = new JRadioButtonMenuItem[fontNames.length];
		fontGroup = new ButtonGroup();
		for(int i=0;i<fonts.length;i++)
		{
			fonts[i] = new JRadioButtonMenuItem(fontNames[i]);
			fontMenu.add(fonts[i]);
			fontGroup.add(fonts[i]);
		}
		fonts[0].setSelected(true);
		fontMenu.addSeparator();
		
		String styleNames[] = {"굵게","기울임"};
		styleItems = new JCheckBoxMenuItem[styleNames.length];
		for(int i=0;i<styleNames.length;i++)
		{
			styleItems[i] = new JCheckBoxMenuItem(styleNames[i]);
			fontMenu.add(styleItems[i]);
		}
		formatMenu.add(fontMenu);
		bar.add(formatMenu);
		JMenu helpMenu = new JMenu("도움말(H)");
		helpMenu.setToolTipText("도움말메뉴입니다.");
		helpMenu.setMnemonic('H');
		JMenuItem helpItem = new JMenuItem("도움말항목(L)");
		helpItem.setMnemonic('L');
		helpMenu.add(helpItem);
		bar.add(helpMenu);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JMenuTest();
	}

}
