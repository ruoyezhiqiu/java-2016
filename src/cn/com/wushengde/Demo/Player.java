package cn.com.wushengde.Demo;

public class Player {
	private String name;
	private int hp;
	private int ap;
	private Arms arm;
	public Player() {
		super();
	}
	public Player(String name, int hp, int ap, Arms arm) {
		super();
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.arm = arm;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAp() {
		return ap;
	}
	public void setAp(int ap) {
		this.ap = ap;
	}
	public Arms getArm() {
		return arm;
	}
	public void setArm(Arms arm) {
		this.arm = arm;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", ap=" + ap + ", arm=" + arm + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ap;
		result = prime * result + ((arm == null) ? 0 : arm.hashCode());
		result = prime * result + hp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (ap != other.ap)
			return false;
		if (arm == null) {
			if (other.arm != null)
				return false;
		} else if (!arm.equals(other.arm))
			return false;
		if (hp != other.hp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getPlayerHurt(){
		if (arm==null) {
			return this.getAp();
		}else{
		return this.getAp()+arm.getArmsHurt();
		}
	}
	
}
