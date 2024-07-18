package JavaArray;

import java.util.ArrayList;

public class PushOnly0sLast {
	
	public static void main(String[] args) {
	     int arr[] = {1,3,0,5,0,3,3,0,9,8,0};
	     ArrayList<Integer> io = new ArrayList<Integer>();
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]!=0)
	    	 {
	    		 io.add(arr[i]);
	    	 }
	     }
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]==0)
	    	 {
	    		 io.add(arr[i]);
	    	 }
	     }
	     
	     System.out.println(io);
	     
	}

}
