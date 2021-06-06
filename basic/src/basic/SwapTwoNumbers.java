package basic;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first=20, second=30, temporary;
		System.out.println("--Before Swapping--");
		System.out.println("Value of First Number:"+first);
		System.out.println("Value of Secound Number:"+second);
		temporary = first;
		first = second;
		second = temporary;
		System.out.println("--After Swapping--");
		System.out.println("Value of First Number:"+first);
		System.out.println("Value of Second Number:"+second);
	}

}
