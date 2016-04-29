package cn.com.wushengde.Demo;
import java.util.Random;
public class RandomUtil {
	// static修饰的成员变量是类级别的，会在类的字节码加载到JVM时被初始化
	// 非static修饰的成员变量是对象级别的，只能在对象被实例化以后才能使用
	// final修饰的引用类型变量，引用地址是只能被初始化一次的，后续不可以修改
	private static final Random random = new Random();

	public static int getInt(int min, int max) {
		// 由于static的程序成员先加载，非static的程序成员后加载，所以：
		// 在static的方法中不可以访问非static的成员变量，也不可以调用非static的方法
		// 在非static的方法中可以访问static的成员变量，也可以调用static的方法
		return random.nextInt(max - min + 1) + min;
	}
}
