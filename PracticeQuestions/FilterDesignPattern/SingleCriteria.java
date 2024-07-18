package FilterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {

	@Override
	public List<Person> meetCriterai(List<Person> persons) {
		List<Person> io = new ArrayList<Person>();
		for(Person person:persons)
		{
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
			{
				io.add(person);
			}
		}
		return io;
	}
	
	

}
