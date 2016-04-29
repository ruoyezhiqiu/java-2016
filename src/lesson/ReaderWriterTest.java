package lesson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterTest {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("src/lesson/ReaderWriterTest.java");Writer writer = new FileWriter("C:/readerwriter.java")){
			int i;
			while ((i = reader.read()) != -1) {
				System.out.print((char)i);
				writer.write(i);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
