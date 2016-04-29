package cn.com.wushengde.Demo;
public class Arms {
	private String name;
	private double hurt;
	private int hurtmax;
	private int hurtmin;

	public int getHurtmax() {
		return hurtmax;
	}
	public void setHurtmax(int hurtmax) {
		this.hurtmax = hurtmax;
	}
	public int getHurtmin() {
		return hurtmin;
	}
	public void setHurtmin(int hurtmin) {
		this.hurtmin = hurtmin;
	}
	public Arms() {
		super();
	}
	public Arms(String name, int hurtmax, int hurtmin) {
		super();
		this.name = name;
		this.hurtmax = hurtmax;
		this.hurtmin = hurtmin;
	}
	@Override
	public String toString() {
		return "Arms [name=" + name + ", hurt=" + hurt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hurt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Arms other = (Arms) obj;
		if (Double.doubleToLongBits(hurt) != Double.doubleToLongBits(other.hurt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHurt() {
		return hurt;
	}
	public void setHurt(double hurt) {
		this.hurt = hurt;
	}
	public int getArmsHurt(){
		return RandomUtil.getInt(hurtmin, hurtmax);
	}
}
