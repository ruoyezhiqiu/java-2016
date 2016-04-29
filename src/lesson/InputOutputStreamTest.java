package lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamTest {
	public static void main(String[] args) {
		try(InputStream inputStream = new FileInputStream("d:/a.txt");OutputStream outputStream = new FileOutputStream("d:/b.txt")) {
			System.out.println(inputStream.available());
			int i;
			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
				outputStream.write(i);
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
