package string_Program;

public class Remove_Space {
public static void main(String[] args) {
	String s = "Ans89hu Si65ngh ";
	String r="",d="";
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(!Character.isWhitespace(c))
			r+=c;
	}
	
	System.out.println(r);
}
}
