package string_Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s1,String s2) {
    	String str1 = s1.replaceAll(" ", " ");
    	String str2 = s2.replaceAll(" ", " ");
    	if(str1.length()!=str2.length())
    		return false;
    	else {
    		char ch1[] = str1.toLowerCase().toCharArray();
    		char ch2[] = str2.toLowerCase().toCharArray();
    		Arrays.sort(ch1);
    		Arrays.sort(ch2);
    		return Arrays.equals(ch1,ch2);
    	}
    }
    public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		boolean res=isAnagram(s1,s2);
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
    
}}
