package afterteacher;

import java.util.Arrays;

public class Demo9_6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.print("交换前数组元素：");
		System.out.println(Arrays.toString(arr));
		changValue(arr,1,2);
		System.out.print("交换后数组元素：");
		System.out.println(Arrays.toString(arr));
	}
	public static void changValue(int[] arr,int index1,int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
