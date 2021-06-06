package basic;

import java.util.Scanner;

public class AreaOfCircle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Enter radius of a Circle :");
		double radius=sc.nextDouble();
		
		double area=Math.PI*(radius*radius);
		System.out.println("Area of a Circle is "+area);
		
		double Circumference=Math.PI* 2 *radius;
		System.out.println("Circumference of a Circle is "+Circumference);
	}

}
