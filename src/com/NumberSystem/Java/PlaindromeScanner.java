package com.NumberSystem.Java;
import java.util.Scanner;
public class PlaindromeScanner {
	public static void main(String[] args) {
		
	
	 System.out.println("enter the number by user");
     //int num=454;
     Scanner sc = new Scanner(System.in);
     int num=sc.nextInt();
     int temp=num;
     int rev=0;
     while(true){
         while(num>0){
         int d=num%10;
         rev=rev*10+d;
         num=num/10;
         
         }
          
     if(temp==rev){
         System.out.println(temp+ " it is palindrome ");
     }else{
         System.out.println(temp + " it is not palindrome");
     }
     break;
     }
      }
  }

