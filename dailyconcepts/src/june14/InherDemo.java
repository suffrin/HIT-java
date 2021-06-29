package june14;
public class InherDemo {
	public static void main(String[] args) {
		Employee p=new Engineer();
		Engineer eng=new Engineer();
		
		p.met(2);
		eng.met(2);
	}
}
class Human{
	public void blabla() {
		System.out.println("bla bla method called....");
	}
}
class Employee extends Human{	
	public int met(int i) {
		System.out.println("met method of employee called...");
		System.out.println(i);
		return i;
	}
}
//rules of method overriding
//1. the parameters, method name and return type shoud be same to same
//2. the accept2 specifier cannot be reduced - visibility cannot be reduced but can be increased.
//inheritance or generalisation
class Engineer extends Employee{//child is a kind of parent,... child can replace parent
	public int met(int i) {//method overriding..
		System.out.println("engineer met method called....");
		super.met(2);//super is a key word which refers the parent class...
		super.blabla();
		return i;
	}
}
class Attender extends Employee{
	
}