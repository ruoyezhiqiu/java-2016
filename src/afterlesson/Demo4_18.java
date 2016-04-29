package afterlesson;
//练习RandomAccessFile的用法：
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo4_18 {

	public static void main(String[] args) {
		try(RandomAccessFile randomAccessFile = new RandomAccessFile("a.txt", "rw")){
			for (int i = 0; i < 10; i++) {
				randomAccessFile.writeDouble(i*0.5);
			}
			randomAccessFile.seek(0L);
			for (int j = 0; j < 10; j++) {
			System.out.println(randomAccessFile.readDouble());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
