package DataStructure;

public class SlidigWindow {
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,2,3,4,1};
		int k = 3;
		int n=arr.length;
		System.out.println(maxSum(arr,n,k));		
	}
	
	public static int maxSum(int arr[],int n,int k)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n-k+1;i++)
		{
			int currentsum=0;
			for(int j=0;j<k;j++)
			{
				currentsum=currentsum+arr[i+j];
			}
			max=Math.max(currentsum, max);
		}
		return max;
	}
	
	

}
