package MapProblems;

import java.util.HashMap;
import java.util.Map;

public class FindSumPair {
	
	public static void main(String[] args) {
		
		int arr[] = {8,7,2,5,3,1};
		int target = 10;
		findPair(arr,target);;
		
	}
	
	public static void findPair(int arr[],int target)
	{
		Map<Integer,Integer> io = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(io.containsKey(target-arr[i]))
			{
				System.out.printf("Pair Found (%d,%d)",arr[io.get(target-arr[i])],arr[i]);
			}
			io.put(arr[i], i);
		}
		System.out.println("Pait not found");
	}

}
