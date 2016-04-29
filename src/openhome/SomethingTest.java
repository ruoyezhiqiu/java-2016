package openhome;
class Something{
	final int x;
	int y = 1;
	Something(){
		x=0;
	}
	Something(int x){
		this.x = 1;
	}
	Something(int j,int k){
		this.x =j;
		k++;
	}
}
public class SomethingTest {

	public static void main(String[] args) {
		Something something = new Something();
		System.out.println(something.x);
		System.out.println(something.y);
	}

}
