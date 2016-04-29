package lesson;
class Box{
	private int length;
	private int width;
	private int high;
	
	public Box() {
		super();
	}

	public Box(int length, int width, int high) {
		super();
		this.length = length;
		this.width = width;
		this.high = high;
	}
	public int getVolume(){
		return length*width*high;
	}
	public int getArea(){
		return (length*width+length*high+width*high)*2;
	}
	
	
}
public class Demo2_3 {

	public static void main(String[] args) {
		Box b1 = new Box(10,10,10);
		System.out.println(b1.getVolume());
		System.out.println(b1.getArea());
		
	}

}
