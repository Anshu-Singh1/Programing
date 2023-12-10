package string_Program;

public class OccuranceOfEachChar {
public static void main(String[] args) {
	String str = "Soul never dies";
	int count[] = new int[128];
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		count[ch]++;
	}
	for(int i=0;i<128;i++) {
		if(count[i]!=0 && count[i]>=1)
			System.out.println((char)i+"---> "+ count[i]);
	}
}
}
