package june10;
public class HelloWorld {
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String suff[]) {//command line arguments
		// TODO Auto-generated method stub
		System.out.println(suff[0]+"..........."+suff[3]);
		//Hello hello=new Hello();//you are loading the class in memory
		//hello.myMethod();
		//static method since it is in memory by default,
		//it should be accessed by the class name itself, without creating a object
		Hello.myMethod();
	}
	public static void main(int [] args) {
	}
}
class Hello{
	static int i=10;
	static float f=10.1f;
	static double d=212121.3434;
	long l=3982409;
	short s=2323;
	byte b=-128;
	
	//static key work will load the method in memory
	//rule - static methods cannot access non static variable...
	//static methods can only access static methods and static variables
	public static void myMethod() {
		System.out.println(i +":"+f+":"+d);
	}
}