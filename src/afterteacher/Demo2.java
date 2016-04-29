package afterteacher;
//需求：1、实现toString()打印一个数组的元素；
//	  2、实现sort()排序一个数组；
//思路：定义一个工具类，实现这两个方法：
//考查对static的应用：
class ArrayTool{
	public static String toString(int[] arr){
		String result ="";//定义一个字符串变量用于存储返回的字符串。
		for(int i = 0;i<arr.length;i++){
			if(i==0){
				result="["+arr[i]+",";
			}else if(i==arr.length-1){
				result+=arr[i]+"]";
			}else{
				result+= arr[i]+",";
			}
		}
		return result;
	}
	//采用了选择排序的方式对数组进行排序：
	public static  void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		int[] arr ={12,18,5,9,20,36,24,25};
		ArrayTool.sort(arr);
		String info =ArrayTool.toString(arr);
		System.out.println("数组中的元素:"+info);
	}

}
