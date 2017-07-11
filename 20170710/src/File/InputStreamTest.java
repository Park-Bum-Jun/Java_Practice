package File;

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0;
		Reader input = null;
		System.out.println("입력을 하세요");
		try {
			input = new InputStreamReader(System.in);
			while (true) {
				var = input.read();
				if (var == 13)
					break;
				System.out.print((char) var);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
