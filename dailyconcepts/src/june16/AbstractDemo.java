package june16;
public class AbstractDemo {
	public static void main(String[] args) {
		//condition 1 - You cannot create an object of abstract class
		//new Parent();//this will throw me an error
		new Child();
	}
}
/*
 * final variables values cannot be changed
 * final classes cannot be inherited
 * final methods cannot be overridden
 */
/*
 * when an abstract class extends another abstract class, the child class need not override
 * the parent abstract class method...
 */
abstract class GrandParent{
	public abstract void met();
}
abstract class Parent extends GrandParent{
	//condition 2 - Can I have a constructor inside abstract class
	//ans: yes you can have....
	final int i=10;//its a constant
	public Parent() {
		System.out.println("abstract class Parent cons called...");
	}
	public abstract void yoursSayHello();
	final public void mySayHello() {//final methods cannot be overriden
		System.out.println("saying hello as per the abstract class norms...");
	}
}
//when you create an object of child class, the parent abstract class constructor gets called
class Child extends Parent{
	public void met(){}
	public Child() {
		System.out.println("child class of abstract parent object created...");
	}
	@Override
	public void yoursSayHello() {
		System.out.println("say hello as per the child class logic....or norms...");
	}
	@Override
	public void mySayHello() {
		System.out.println("write my own logic..");
	}
}
