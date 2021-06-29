package june9;
//Constructor overloading..
public class ConsDemo {
	public ConsDemo() {
		System.out.println("cons called...");
	}
	
	public ConsDemo(int i) {
		System.out.println("overloaded cons called...");
	}
	
	public ConsDemo(String s) {
		System.out.println("string constructor called...");
	}
	
	public ConsDemo(int s,String str) {
		System.out.println("multi parameter constructor called...");
	}
	public static void main(String[] args) {
		ConsDemo obj1=new ConsDemo(100,"hello");
		ConsDemo obj2=new ConsDemo();
		ConsDemo obj3=new ConsDemo("hi");
		
		obj2.met();
		obj2.met(1);
		//the name of the concept is - Virtual Method Invocation (VMI)
		//only one constructor can be called when one object is created...
	}
	
	void met() {
		System.out.println("method without parameter called...");
	}
	void met(int i) {
		System.out.println("method with parameter called...");
	}
}