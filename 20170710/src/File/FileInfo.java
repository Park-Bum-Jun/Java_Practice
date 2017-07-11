package File;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		File file = new File("C:\\Users\\범준\\Documents\\gitignore_global.txt");
		String filelm = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date(file.lastModified()));
		if(file.exists()){
			str += "파일명: "+file.getName() + "\n"+
					"파일의 크기 : "+file.length() + "\n"+
					"마지막 수정일: "+filelm +"\n"+
					"부모 디렉토리: "+file.getParent();
			
			
		}
		else
		{
			str = "해당파일이 존재하지 않습니다.";
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
