package DataStructure;

public class linerSearch {
	
	public static void main(String[] args) {
		int arr[]= {5,6,7,34,23,1,25,78,9};
		int a=34;
		int len = arr.length;
		
		int k = linSearchMethod(arr,a,len);
		System.out.println(k);
	}
	
	public static int linSearchMethod(int arr[],int a,int len)
	{
		for(int i=0;i<len;i++)
		{
			if(arr[i]==a)
			{
				return i;
			}
		}
		return -1;
	}

}
