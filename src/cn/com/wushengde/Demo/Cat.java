package cn.com.wushengde.Demo;

public class Cat {
	static String name;//定义猫的名字；
	String color;//定义猫的颜色；
	String foot;//定义猫拥有的脚的支数；
	int weight;//定义猫的体重；
	//final String city;
	public Cat(){
		name = " aaa";
	}
	public Cat(String name,String color,String foot,int weight){
	
		Cat.name = name;
		this.color = color;
		this.foot = foot;
		this.weight = weight;
	}
}