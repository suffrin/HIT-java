package june11;
/*Rules of overloading
 * 1.  The method name should be same
 * 2.  The parameter should be different
 * 3.  The access specifier can be changed.
 * 4.  The return type can be changed...
 * Depending on the parameters you pass, the JRE will use DMI (dynamic/virtual Method Invocation)
 * technique to call the appropriate method.. so we achieve
 */
public class Revision2 {
	public Revision2() {
		System.out.println("Revision2 block");
	}
	public void sayHello() {
		//business logic here....
		System.out.println("no param method called...");
	}
	
	//method overloading
	public void sayHello(int i) {
		System.out.println("one param method called...");
	}
	
	int sayHello(int i,String s) {
		System.out.println("two param method called...");
		return 1;
	}
	void sayHello(String s,int i) {
		System.out.println("two param string first method called..");
	}
	
	public void varialArgumentMethod(int i,int j, int k) {
		System.out.println("three int param method called..");
	}
	//var args...
	public void varialArgumentMethod(int... i) {
		System.out.println("var args method is called...");
		for(int s:i) {
			System.out.print(s+" ");
		}
	}
	public void variable(String... s) {
		System.out.println("\n  ");
		for(String str:s) {
			System.out.println(str);
		}
	}
	public void arrayMet(int i[]) {
		for(int j:i) {
			System.out.print(j+"\t");//t is a escape sequence - prints a tab space
		}
	}
	public int[] arraymet2() {
		int i[]= {34,54,67,78};
		return i;
	}
	
	public MyType complexTypeMethod(MyType... mytp) {
		return new MyType();
	}
	public static void main(String[] args) {
		Revision2 obj=new Revision2();
		obj.sayHello("hello",34);
		obj.varialArgumentMethod(1,2,3,4,5,6,7);
		obj.variable("aaa","bbb","cccc","ddddd");
		int i[]= {34,54,67,78};
		obj.arrayMet(i);
		//int kk[]=obj.arraymet2();
		
		obj.complexTypeMethod(new MyType(),new MyType(),new MyType());
	}
}
//any class u right, is by default complex type
class MyType{	
}