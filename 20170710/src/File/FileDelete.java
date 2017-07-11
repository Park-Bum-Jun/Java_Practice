package File;

import java.io.*;


public class FileDelete {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete("c:\\test.txt");

	}
	
	public static void delete(String filename){
		File f = new File(filename);
		
		if(!f.exists())
		{
			System.out.println("Delete : 파일을 찾을 수 없습니다.:"+filename);
			System.exit(0);
		}
		if(!f.canWrite())
		{
			System.out.println("Delete : 쓰기 방지가 되어서 삭제할 수 없습니다."+filename);
			System.exit(0);
		}
		if(f.isDirectory())
		{
			String[] files = f.list();
			if(files.length > 0)
				System.out.println("Delete : 디렉토리가 비어있지 않습니다."+filename);
			System.exit(0);
		}
		boolean success = f.delete();
		if(!success)
			System.out.println("Delete : 파일 삭제 실패");
		else
			System.out.println("Delete : 파일 삭제 성공");
	}

}
