package MapProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDuplicateCount {
	
	public static void main(String[] args) {
		
		String arr[] = {"sasi","mani","arav","sasi","arava","thilak"};
		List<String> ui = Arrays.asList(arr);
		Map<String,Integer> io = new HashMap<>();
		for(String t:ui)
		{
			io.put(t,io.getOrDefault(t,0)+1);
		}
		
		
	}

}
