package basic;
import java.util.Scanner;

public class ReverseNumberWhile {
	public static void main(String args[]) {
		int num=0, reversenumber=0;
		System.out.printf("Enter input number : ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		while(num != 0) {
			reversenumber = reversenumber * 10;
			reversenumber = reversenumber + (num % 10);
			num = num / 10;
		}
		System.out.println("Reverse of input number : "+reversenumber);
	}
}
