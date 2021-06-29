package Ques;
public class Question2 {
	public static void main(String arguments[]) {
		amethod(arguments);		
	}
	public static void amethod(String[] arguments) {
		System.out.println(arguments);
		//System.out.println(arguments[1]);
		System.out.println("working..!");
	}
}
//Answer : a)Error can't make static reference to void amethod.
		//OUTPUT	//[Ljava.lang.String;@182decdb
					//working..!
