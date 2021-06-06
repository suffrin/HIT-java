package basic;

public class SwapNumbers {
	public static void main (String[] args) {
		int first=20, second=30;
		System.out.println("--Before Swapping");
		System.out.println("First Number:"+first);
		System.out.println("second Number:"+second);
		first= first-second;
		second=first+second;
		first=second-first;
		System.out.println("--After swapping--");
		System.out.println("First Number:"+first);
		System.out.println("Second Number:"+second);
	}
}
