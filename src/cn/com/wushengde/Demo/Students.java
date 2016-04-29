package cn.com.wushengde.Demo;

class Students {
  private String name;
  private char gender;
  private int age;
  private String number;
  private String major;
public Students(String name, char gender, int age, String number, String major) {
	super();
	this.name = name;
	this.gender = gender;
	if(age<18||age>50){
		this.age = 30;
	}else{
	this.age = age;
	}
	this.number = number;
	this.major = major;
}
public Students() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<18||age>50){
		this.age = 30;
	}else{
	this.age = age;
	}
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + gender;
	result = prime * result + ((major == null) ? 0 : major.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((number == null) ? 0 : number.hashCode());
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
	Students other = (Students) obj;
	if (age != other.age)
		return false;
	if (gender != other.gender)
		return false;
	if (major == null) {
		if (other.major != null)
			return false;
	} else if (!major.equals(other.major))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (number == null) {
		if (other.number != null)
			return false;
	} else if (!number.equals(other.number))
		return false;
	return true;
}
@Override
public String toString() {
	return "Students [name=" + name + ", gender=" + gender + ", age=" + age + ", number=" + number + ", major=" + major
			+ "]";
}

}
