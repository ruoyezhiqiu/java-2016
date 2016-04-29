package cn.com.wushengde.Demo;

public class Ram {
	private String type;
	private String Volumen;
	public Ram() {
		super();
	}
	public Ram(String type, String volumen) {
		super();
		this.type = type;
		Volumen = volumen;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVolumen() {
		return Volumen;
	}
	public void setVolumen(String volumen) {
		Volumen = volumen;
	}
	@Override
	public String toString() {
		return "Ram [type=" + type + ", Volumen=" + Volumen + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Volumen == null) ? 0 : Volumen.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Ram other = (Ram) obj;
		if (Volumen == null) {
			if (other.Volumen != null)
				return false;
		} else if (!Volumen.equals(other.Volumen))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
