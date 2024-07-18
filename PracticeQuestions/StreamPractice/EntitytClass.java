package StreamPractice;

public class EntitytClass extends ChildClass {
	
	private int id;
	private String firstname;
	private String lastname;
	private long phone;
	private String address;
	private long salary;
	private int age;
	
	public EntitytClass()
	{
		
	}
	
	public EntitytClass(int id,String firstname,String lastname,long phone,String address,long salary,int age,String gender)
	{
		this.id =id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
		this.age=age;
		this.gender=gender;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
