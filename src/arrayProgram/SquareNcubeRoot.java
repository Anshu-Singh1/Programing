package arrayProgram;

public class SquareNcubeRoot {
public static void main(String[] args) {
	int[] arr = {9,12,8,14,16};
	double s[] = new double[arr.length];
	double c[] = new double[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		s[i] = Math.sqrt(arr[i]);
		c[i] = Math.cbrt(arr[i]);
		
	}
	for(int i=0;i<arr.length;i++) {
	System.out.println("square " + s[i] +" = " + " cube "+ c);
		
	}
	
}
}

