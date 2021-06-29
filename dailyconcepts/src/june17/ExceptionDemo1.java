package june17;
public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		//Integer.parseInt - will convert a string to a number
		int num=1;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;//the program gets terminated at this point....
			System.out.println("immediate line after exception...");
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("logic to handle arithmetic exception");
				num=num+1;
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				num=1;
			}
			else if(e instanceof NumberFormatException) {
				num=1;
			}
		}
		int i=1/num;
		System.out.println("value of i is...:"+num);
		System.out.println("After Exception...."+num);
	}
}
/*
 *There are two things u have to do for exception handling
 *
 * 1.  Stop the abrupt termination of your application. - very important - Relief
 * 2.  Give a alternate flow- optional - we will talk about it later. - Rehabilitation
 *
*/
