package starPattern;

public class PyramidPattern {
public static void StarPattern(int n) {
	for(int i=0;i<n;i++) //outer loop for number of rows(n)
	{
		for(int j=n-i;j>1;j--)//loop for space 
		{
			System.out.println(" ");//outer space
		}
		for(int j=0;j<=i;j++)//inner loop for num of column 
		{
			System.out.println("* ");//print star
		}
		System.out.println();//ending line for each row
	}
}
public static void main(String[] args) {
	int n=5;
	StarPattern(n);
}
}
