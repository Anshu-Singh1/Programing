package arrayProgram;

public class Student {
public static void main(String[] args) {
	String[] arr  =  {"sam ", " maya " , "joe", " ronit","nihir"};
	int M1[] = {45,65,74,68,85};
	int M2[] = {45,65,98,87,95};
	int M3[] = {75,85,98,87,55};
	double avg[] = new double[M1.length];
	double sum=0, cavg=0;
	for(int i=0;i<arr.length;i++) {
		avg[i] = (M1[i]+M2[i]+M3[i])/3;
		sum +=avg[i];
		System.out.println(arr[i] + " " + avg[i]);
		
	}
	cavg  = sum + M1.length;
	System.out.println("class average "+cavg);
	
	
	
	
	
}
}
