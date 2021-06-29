package june9;
import java.util.Scanner;
public class SimpleDemo3 {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Input a number.....");
		int num=scan.nextInt();
		
		System.out.println("Input a number when to stop...:");
		int num2=scan.nextInt();
		scan.close();
		while(true) {
			//num--;
			if(num%2==0) {
				System.out.println("even number...:"+num);
				//continue;
			}
			else if(num==num2) {
				System.out.println("break the loop....");
				break;
			}
			num--;
		}
	}
}