package CompositePattern;

public class MainMethod {
	
	public static void main(String[] args) {
		Employee CEO = new Employee("Jhone","CEO",30000);
		Employee headSales = new Employee("Robert","Head sales",20000);
		Employee cleark = new Employee("Rober","clerl",12000);
		CEO.add(headSales);
		CEO.add(cleark);
		for(Employee emp: CEO.getSubordinates())
		{
			System.out.println(emp);
		}
	}

}
