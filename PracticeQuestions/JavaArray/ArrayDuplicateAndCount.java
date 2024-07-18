 package JavaArray;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateAndCount {
	
	public static void main(String[] args) {
		int arr[] = {3,3,4,5,6,7,7,2,2};
		
		Map<Integer,Integer> io = new HashMap<Integer,Integer>();
		for(int num:arr)
		{
			if(io.containsKey(num))
			{
				io.put(num, io.get(num)+1);
			}
			else
			{
				io.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> uy:io.entrySet())
		{
			
			System.out.println(uy.getKey()+"   "+uy.getValue());

		}
		
	}
        
}
