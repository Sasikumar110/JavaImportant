package FilterDesignPattern;

import java.util.List;

public class OrCriteria implements Criteria{
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria,Criteria otherCriteria)
	{
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}

	@Override
	public List<Person> meetCriterai(List<Person> persons) {
          List<Person> firstCriteriaItems = criteria.meetCriterai(persons);
          List<Person> otherCriterItems = otherCriteria.meetCriterai(persons);
          for(Person person:otherCriterItems)
          {
        	  if(!firstCriteriaItems.contains(person))
        	  {
        		 firstCriteriaItems.add(person); 
        	  }
          }
          return firstCriteriaItems;
	}
	

}
