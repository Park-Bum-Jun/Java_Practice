package File;
import java.io.*;

public class ByteStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0;
		System.out.println("���ڸ� �Է��ϼ���(����:Enter)");
		try {
			var = System.in.read();
			while(var != 13)
			{
				System.out.print((char)var);
				var = System.in.read();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
