package string_Program;

public class NewString_Upper {
public static void main(String[] args) {
	String s = "Anshu SIngh";
	String sn="";
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			sn = sn+c;
	}
	System.out.println(sn);
}
}
