package com.NumberSystem.Java;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
System.out.println("please Provide input");	
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int previous =0,next = 1, result=0;
for(int i = 0;i<=n;i++) {
	
	System.out.print(previous + " ");
	result = previous+next;
	previous = next;
	next=result;
	}
}
}
