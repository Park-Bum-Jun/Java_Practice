package File;

import java.io.*;

public class DataIOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dataout = new DataOutputStream(new FileOutputStream("C:\\test2.txt"));
		
		dataout.writeInt(123);
		dataout.writeChar('k');
		dataout.writeDouble(123.4);
		dataout.close();

		DataInputStream datain = new DataInputStream(new FileInputStream("C:\\test2.txt"));

		System.out.println(datain.readInt());
		System.out.println(datain.readChar());
		System.out.println(datain.readDouble());
		datain.close();

	}

}
