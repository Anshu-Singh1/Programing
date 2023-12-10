package com.NumberSystem.Java;

public class StringPalindrome {
public static void main(String[] args) {
	String str = "Radar";
	String reverseStr="";
	int strLength = str.length();
	for(int i=str.length()-1;i>=0;--i) {
		reverseStr = reverseStr+str.charAt(i);
		
	}
	if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
		System.out.println(str + " it is palindrome");
	}else {
		System.out.println(str + "it is not palindrome");
	}
}
}
