package string_Program;

public class Print_Each_UpperCase {
public static void main(String[] args) {
	String s = "My Name Is Anshu";
	int countU = 0,countL = 0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			countU++;
		if(Character.isLowerCase(c))
			countL++;
	}
	System.out.println(countU +" -upper");
	System.out.println(countL + " -lower");
	
}
}
