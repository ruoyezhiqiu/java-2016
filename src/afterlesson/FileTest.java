package afterlesson;
//File 的练习：
import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:/a/b/c/d");
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.mkdirs());

	}

}
