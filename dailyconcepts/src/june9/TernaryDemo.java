package june9;
public class TernaryDemo {
	public static void main(String[] args) {
		// ? - ternary operator
		//String result=(30<20) ? "30 is lesser than 20":"30 is not lesser than 20";
		int i=11;
		String number=(i%2==0)?"Even number...":"odd number...";
		//System.out.println(result);
		System.out.println("Number is...:"+number);
		//(expression)  ?  "true": "false";
	}
}