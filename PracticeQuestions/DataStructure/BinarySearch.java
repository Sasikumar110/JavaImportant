package DataStructure;

public  class BinarySearch {
	
	public static void main(String[] args) {
		int arr[]= {5,6,7,34,23,1,25,78,9};
		int a=78;
		
		int k = binSearchMethod(arr,a);
		System.out.println(k); 
	}
	
	public  static int binSearchMethod(int arr[],int a)
	{
		int left=0;
		int right = arr.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==a)
			{
				return mid;
			}
			if(arr[mid]<a)
			{
				left=mid+1;				
			}
			else {
				right=mid-1;
			}
		}
		return -1;
		
	}

}
