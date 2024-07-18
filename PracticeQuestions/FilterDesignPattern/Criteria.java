package FilterDesignPattern;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriterai(List<Person> persons);

}
