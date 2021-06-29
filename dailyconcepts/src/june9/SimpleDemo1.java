package june9;
import java.util.Scanner;
public class SimpleDemo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number...:");
		int num1=scan.nextInt();
		System.out.println("Please enter another number...:");
		int num2=scan.nextInt();
		
		System.out.println("Please enter your choice...");
		System.out.println("1 for Addition..");
		System.out.println("2 for multiplication..");
		
		int choice=scan.nextInt();
		
		int result=(choice==1)?(num1+num2):(num1*num2);
		
		System.out.println("The result is..:"+result);
		scan.close();
	}
}