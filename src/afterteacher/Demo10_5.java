package afterteacher;

/**
 * 异常练习：
 * Created by john on 2016/4/16.
 */
public class Demo10_5 {
    public static void main(String[] args) {
//        创建一个Throwable的异常对象：
/*        Throwable throwable = new Throwable("hello");
//        Throwable的toString()方法：返回当前异常对象的完整类名+传入的参数信息，返回类型为：String类型。
        String string = throwable.toString();
        System.out.println(string);
        String s1 = throwable.getMessage();
        System.out.println(s1);*/
        test();
    }
    public static void test(){
        Throwable throwable = new Throwable();
//        Throwable的printStackTrace
        throwable.printStackTrace();
    }

}
