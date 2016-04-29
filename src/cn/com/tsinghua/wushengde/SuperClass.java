package cn.com.tsinghua.wushengde;

/**
 * Created by Administrator on 2016/4/13.
 */
public class SuperClass {
    private int i;
    private double d;
    public SuperClass(){

    }
    public SuperClass(int i,double d){
        this.i = i;
        this.d = d;
    }
    public void getStrings(){
        System.out.println("hello world !");
    }
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
    
}
class SubClass extends SuperClass {
    private String s;
    public SubClass(int i,double d,String s){
        super(i,d);
        this.s = s;
    }
    public void geta(int a,double b){
    	System.out.println("aaa");
    }
    public void geta(double a,int b){
    	System.out.println("bbb");
    }

    public static void main(String[] args) {
        SuperClass superClass =new SuperClass();
        SubClass subClass = new SubClass(1,1.1,"hello world");
        System.out.println(superClass.getD());
        System.out.println(superClass.getI());
        System.out.println(subClass.getD());
        System.out.println(subClass.getI());
        System.out.println(subClass.s);

    }
}

