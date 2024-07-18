package DataStructure;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {5,3,9,6,22,43,56,12,23};
		int len =arr.length;
		SelectSortMethod(arr);
	    System.out.println("Sorted Array");
	    printArray(arr,len);
	}
	
	public static void SelectSortMethod(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]<arr[i])
				{
				i=j;
				}
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	
	
	public static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");			
		}
	}

}
