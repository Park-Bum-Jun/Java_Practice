package File;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		File file = new File("C:\\Users\\����\\Documents\\gitignore_global.txt");
		String filelm = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(file.lastModified()));
		if(file.exists()){
			str += "���ϸ�: "+file.getName() + "\n"+
					"������ ũ�� : "+file.length() + "\n"+
					"������ ������: "+filelm +"\n"+
					"�θ� ���丮: "+file.getParent();
			
			
		}
		else
		{
			str = "�ش������� �������� �ʽ��ϴ�.";
		}
		System.out.println(str);
		System.out.println("=============================");
		
		File dir = new File(".");
		String[] strs = dir.list();
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
	}

}
