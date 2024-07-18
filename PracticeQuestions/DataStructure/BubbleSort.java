package DataStructure;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {5,6,7,4,3,45,7,22};
		int n =arr.length;
		bubbleSort(arr,n);
		System.out.println("Sorted Array");
		printArray(arr,n);
	}
	
	public static void bubbleSort(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
		   for(int j=i+1;j<n;j++)
		   {
			   if(arr[i]>arr[j]) {
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   }
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
