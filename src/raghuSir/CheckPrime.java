package raghuSir;

import java.util.Scanner;

public class CheckPrime {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Prime number between 1 and "+n);
	//Loop through the numbers one by one
	for(int i=0;i<n;i++) {
		boolean isPrime = true;
		//Check to see if number is prime
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime = false;
				break;
			}
		}
		//Print the Number
		if(isPrime)
			System.out.print(i + " ");
	}
	
}
}
