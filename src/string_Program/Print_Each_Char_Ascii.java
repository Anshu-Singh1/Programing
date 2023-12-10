package string_Program;

public class Print_Each_Char_Ascii {
public static void main(String[] args) {
	String s = "My Name Is Anshu";
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		  System.out.println(c +" "+ (int)c);
	}
	
}
}
