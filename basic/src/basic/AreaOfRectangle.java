package basic;
import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		System.out.printf("Enter length of a Rectangle :");
		Scanner sc = new Scanner(System.in);
		double length=sc.nextDouble();
		
		System.out.printf("Enter Width of a Rectangle :");
		double width=sc.nextDouble();
		
		sc.close();
		
		double area=length*width;
		System.out.printf("Area of a Rectangle is "+area);
	}
}
