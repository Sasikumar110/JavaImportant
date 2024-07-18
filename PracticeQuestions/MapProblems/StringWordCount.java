package MapProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWordCount {
	
	public static void main(String[] args) {
		String s="madam";
		char c[]=s.toCharArray();
		List<Character> ty =  new ArrayList<Character>();
		for(char t:c)
		{
			ty.add(t);
		}
		Map<Character,Long> rt = ty.stream().collect(Collectors.groupingBy(Character::valueOf,Collectors.counting()));
		for(Map.Entry<Character, Long> et:rt.entrySet())
		{
			if(et.getValue()>1)
			{
				System.out.println(et);
			}
		}
	}

}
