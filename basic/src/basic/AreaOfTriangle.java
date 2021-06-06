package basic;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		System.out.printf("Enter base of a Triangle :");
		Scanner sc = new Scanner(System.in);
		double base=sc.nextDouble();
		
		System.out.printf("Enter height of a Triangle :");
		double height=sc.nextDouble();
		
		sc.close();
		
		double area=(base*height)/2;
		System.out.printf("Area of a Triangle is "+area);
	}
}