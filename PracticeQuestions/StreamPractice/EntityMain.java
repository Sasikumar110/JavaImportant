package StreamPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EntityMain {
	
	public static void main(String[] args) {
		
		List<EntitytClass> kl = Arrays.asList(
				new EntitytClass(1,"sasikumar","ganesan",962696204,"tiruppur",25000,23,"male"),
				new EntitytClass(2,"manikandan","aravindth",969696204,"palldam",23000,22,"male"),
				new EntitytClass(3,"yasanth","kumar",962696204,"salem",27000,19,"female"),
				new EntitytClass(4,"juilan","mahan",962696204,"erode",31000,29,"female"),
				new EntitytClass(5,"hunger","manik",962696204,"kerela",26700,30,"female"),
				new EntitytClass(6,"aleksean","mani",74567890,"salem",19000,29,"male"));
		
		List<EntitytClass> io =  kl.stream().sorted(Comparator.comparing(EntitytClass::getSalary).reversed()).skip(3).collect(Collectors.toList());
		io.forEach(x->{
			System.out.println(x.getFirstname()+"   "+x.getLastname()+"  "+x.getSalary());
		});
		
   
 
	}

}
