package week02;
import java.util.Scanner;
class WhileLoop { 
	public static void main(String args[]) { 
		int x = 1, sum = 0; 
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter the Limit:"); 
		int n=in.nextInt();
		in.close();
		// Exit when x becomes greater than n 
		while (x <= n) { 
			// summing up x 
			sum = sum + x; 
			// Increment the value of x for 
			// next iteration 
			x++; 
		} 
	System.out.println("Summation: " + sum); 
	} 
}