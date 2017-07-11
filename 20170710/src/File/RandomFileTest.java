package File;
import java.io.*;
public class RandomFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		String str = "";
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\randomtest.txt","rw");
			String k = new String("bye bye java");
			file.seek(file.length());
			file.write(k.getBytes());
			file.writeChar('\n');
			file.seek(0);
			while(file.getFilePointer() < file.length())
			{
				output += file.getFilePointer();
				output+=":";
				str = file.readLine();
				output += str+"\n";
				System.out.println(output);
			}
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error : "+e.toString());
		}
		System.exit(0);
	}

}
