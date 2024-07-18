package StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoStringCode {
	
	public static void main(String[] args) {
		
		String s="egg";
		String t="bdd";
		boolean k =GetBollean(s,t);
		System.out.println(k);
	}
	
	public static boolean GetBollean(String s,String t)
	{
		boolean ret = false;
		int l1=s.length();
		int l2=t.length();
		if(l1!=l2)
		{
			ret=true;
		}
		List<String> op = new ArrayList<String>();
		op.add(s);
		op.add(t);
		Map<Character,Integer> pi = new HashMap<>();
		for(String f:op)
		{	
			for(char c:f.toCharArray())
			{
				pi.put(c, pi.getOrDefault(c, 0)+1);
			}
			int duplcount=0;
			for(int i:pi.values())
			{
			   if(i>1)
			   {
				   duplcount++;
				   return ret;
			   }
			}
			System.out.println("String :"+f+"count"+duplcount);
		}
		
		return ret;
				
	}

}
