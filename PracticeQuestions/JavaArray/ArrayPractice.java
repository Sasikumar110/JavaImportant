package JavaArray;

import java.util.Arrays;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		int arr[] = {6,4,8,3,5};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=5)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
