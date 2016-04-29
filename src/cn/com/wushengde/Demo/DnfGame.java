package cn.com.wushengde.Demo;

public class DnfGame {

	public static void main(String[] args) {
		Arms a1 = new Arms("无尽",500,100);
		Arms a2 = new Arms("黑切",300,100);
		Arms a3 = new Arms("破败",400,200);
		Player player1 = new Player("蛮王",10000,500,a1);
		Player player2 = new Player("盖伦",30000,200,a2);
		Player player3 = new Player("赵信",20000,400,a3);	
		
		System.out.println(player1.getName()+"给对方造成"+player1.getPlayerHurt()+"点真实伤害！");
		System.out.println(player2.getName()+"给对方造成"+player2.getPlayerHurt()+"点真实伤害！");
		System.out.println(player3.getName()+"给对方造成"+player3.getPlayerHurt()+"点真实伤害！");
	}

}
