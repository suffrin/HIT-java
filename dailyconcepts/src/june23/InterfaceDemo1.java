package june23;
public class InterfaceDemo1 {
public static void main(String[] args) {
	AlopathyMedicalCollege1 stanley=new AlopathyMedicalCollege1();
	Doctor1 doctor=(Doctor1)stanley;//By casting you get user level rights and previlages
	doctor.doCure();
	Nurse1 nurse=(Nurse1)stanley;
	nurse.doNursing();
	
	HomeoPathyMedicalCollege1 homeoDoctor=new HomeoPathyMedicalCollege1();
	Doctor1 doctor2=(Doctor1)homeoDoctor;
	doctor2.doCure();
	Nurse1 nurse2=(Nurse1)homeoDoctor;//I will get a exception at this line
	nurse2.doNursing();
	
	System.out.println(Doctor.i);
}
}
interface Doctor1{
	//there is no compulsion to have a method
	//Interfaces with no methods are called marker interfaces
	//You can have one or more methods
	//A interface with only one method is called Functional Interface
	public void doCure();
	//interface with more than one method is a normal interface
	//What is special about functional interfaces
	//Function interfaces alone can use - Method Expressions and Lambdas.
	//where as marker or normal interfaces (interface with more than one method)
	//cannot use MethodExpressions and Lambda - introduced in jdk8
	//Interfaces can also have fields declared.
	final static int i=10;//even if you dont give it is still final and static
	//Fields are by default static and final. which means they are constants.
	//interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called....");
	}
	//default methods can be accessed only within the interfaces
	//they are equivalent to template method of abstract classes
}
//interface can extend another interface
interface Surgeon1 extends Doctor{
	
}
interface Nurse1{
	public void doNursing();
}
//implementation class of Interface...
class AlopathyMedicalCollege1 implements Doctor,Nurse{
@Override
public void doNursing() {
	System.out.println("Nursing method called....");
}
	@Override
	public void doCure() {
		System.out.println("do cure method called..as per alopathy.....");
	}
}
class HomeoPathyMedicalCollege1 implements Doctor{
	@Override
	public void doCure() {
		System.out.println("do cure method called ... as per homoeopathy...");
	}
}