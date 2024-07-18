package MapProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IntegerFrequecy {
	
	public static void main(String[] args) {
		int arr[] = {1,1,13,4,11,13,4,4,7,9,36,2};
		Map<Integer,Integer> op = new HashMap<>();
		for(int i:arr)
		{
			op.put(i, op.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> ty:op.entrySet())
		{
		    if(ty.getValue()>=2)
		    {
//		    	System.out.println(ty);
		    }
		}
		
		List<Integer> rt = new ArrayList<>();
		for(int i:arr)
		{
			rt.add(i);
		}
		
		Map<Object, Long> ut = rt.stream().collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting()));
		System.out.println(ut);
		
	}

}
