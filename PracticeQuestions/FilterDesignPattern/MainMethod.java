package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
	
	public static void main(String[] args) {
		List<Person> person =new ArrayList<Person>();
		person.add(new Person("Robert","Male","Single"));
		person.add(new Person("Insteen","Female","Married"));
		person.add(new Person("Laura","Male","Single"));
		person.add(new Person("Robert","Female","Married"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new SingleCriteria();
		Criteria singleMale = new AndCriteria(single,male);
		Criteria singleOrFemale = new OrCriteria(single, female);
		
		System.out.println("Males: ");
		printPersons(male.meetCriterai(person));
		
		System.out.println("Females: ");
		printPersons(female.meetCriterai(person));
		
		
		
	}
	
	public static void printPersons(List<Person> persons)
	{
		for(Person person:persons)
		{
			System.out.println("Person :[Name : "+person.getName()+" Gender: "+person.getGender()+" Marital Status :"+person.getMaritalStatus()+ "]");
		}
	}
	

}
