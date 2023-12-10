package string_Program;

public class First_Digit_Char {
public static void main(String[] args) {
	String s = "Ans89hu Si65ngh ";
	String d="",r="";
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(Character.isDigit(c))
			d=d+c;
		else
			r=r+c;
	}
	String sen = d+r;
	System.out.println(sen);
}
}
