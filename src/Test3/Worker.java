package Test3;
public class Worker implements Comparable{
	String name;
	int age;
	double salary;
	
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void work(){
		System.out.println(getName()+"勤奋地工作了");
	}
	//按照年龄大小进行排序
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Worker){
			Worker w = (Worker)o;
			if(this.age>w.age){
				return 1;
			}else if(this.age<w.age){
				return -1;
			}else if(this.age==w.age){
				return 0;
			}
		}
		return -2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"\t"+this.age+"\t"+this.salary;
	}
	
}
