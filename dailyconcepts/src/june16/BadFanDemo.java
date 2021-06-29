package june16;
/*
 * Solve this code by
 * eliminating the if-else-if condition in BadFan to make it GoodFan
 * hint - use inheritance and association to solve this problem
 */
import java.util.Scanner;
public class BadFanDemo {
	public static void main(String[] args) {
		BadFan shaitan=new BadFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Press a key and enter to pull chain...");
			scan.next();
			shaitan.pull();
		}
	}
}
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state....");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state.....");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}
	}
}