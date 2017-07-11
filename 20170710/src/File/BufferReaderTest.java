package File;

import java.io.*;

public class BufferReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		
		BufferedReader reader = null;
		try {
			while(true)
			{
				System.out.println("문자열을 입력(중단은 '끝')");
				reader = new BufferedReader(new InputStreamReader(System.in));
				str = reader.readLine();
				if(str.equals("끝"))
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
