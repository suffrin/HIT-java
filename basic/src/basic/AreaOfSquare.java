package basic;
import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.printf("Enter side of a Square :");
		Scanner sc = new Scanner(System.in);
		double side=sc.nextDouble();
		sc.close();
		
		double area=side*side;
		System.out.printf("Area of a Square is "+area);
	}
}