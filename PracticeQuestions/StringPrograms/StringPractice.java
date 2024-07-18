package StringPrograms;

public class StringPractice {
	
	public static void main(String[] args) {
		String s= "Sasikumar110";
		char c[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(c[i]))
			{
				System.out.println(c[i]);
			}
		} 
	}
	

}
