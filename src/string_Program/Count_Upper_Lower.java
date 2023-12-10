package string_Program;

public class Count_Upper_Lower {
public static void main(String[] args) {
	String s = "My Name Is Anshu";
	int count = 0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			System.out.println(c);
		  
	}
	
	
}
}
