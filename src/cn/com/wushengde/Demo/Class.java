package cn.com.wushengde.Demo;

public class Class {
	private String name;
	private String address;
	private String time;
	private String teacher;
	private int max;
	
	public Class(String name, String address, String time) {
		super();
		this.name = name;
		this.address = address;
		this.time = time;
	}

	public Class(String name, String address, String time, String teacher, int max) {
		super();
		this.name = name;
		this.address = address;
		this.time = time;
		this.teacher = teacher;
		if(max>300||max<20){
			this.max =300;
		}else{
		this.max = max;
		}
	}

	public Class() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		if(max>300||max<20){
			this.max =300;
		}else{
		this.max = max;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + max;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Class other = (Class) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (max != other.max)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", address=" + address + ", time=" + time + ", teacher=" + teacher + ", max="
				+ max + "]";
	}
	

}
