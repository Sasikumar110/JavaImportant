package MapProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PossibleSubarray {

	public static void main(String[] args) {
		int arr[]= {3,4,-7,1,3,3,1,-4};
		int target=4;
//		findSubarrays(arr,target);
		HashIngArray(arr,target);
	}
	
	public static void findSubarrays(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==target)
				{
					printValues(arr,i,j);
				}
			}
		}
	}
	
	public static void HashIngArray(int arr[],int target)
	{
		Map<Integer,List<Integer>> ui = new HashMap<>();
		insert(ui,0,-1);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			sum+=arr[i];
			System.out.println("sum " +sum);
			if(ui.containsKey(sum-target))
			{
				List<Integer> po = ui.get(sum-target);
				for(Integer y:po)
				{
					printValues(arr,y+1,i);	
				}
			}
			insert(ui,sum,i);
		}
	}
	
	public static<k,v> void insert(Map<k,List<v>> hashMap,k key,v value)
	{
		hashMap.putIfAbsent(key, new ArrayList<>());
		hashMap.get(key).add(value);
	}
	
	public static void printValues(int arr[],int i,int j)
	{
		List<Integer> io = IntStream.range(i, j+1).mapToObj(k->arr[k]).collect(Collectors.toList());
		System.out.println(io);
	}
	
	
}
