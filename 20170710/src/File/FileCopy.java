package File;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="";
			BufferedReader reader = null;
			BufferedWriter writer = null;
			try {
				reader = new BufferedReader(new FileReader(new File("C:\\Users\\범준\\Documents\\test2.txt")));
				writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\범준\\Documents\\copy.txt")));
				while((str = reader.readLine())!=null)
				{
					writer.write(str);
					writer.newLine();
				}
				System.out.println("파일쓰기 성공");
				System.out.println("두개의 파일을 열어서 확인바람");
				reader.close();
				writer.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
