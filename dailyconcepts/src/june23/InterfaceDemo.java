package june23;
public class InterfaceDemo {
public static void main(String[] args) {
	AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
	Doctor doctor=(Doctor)stanley;
	doctor.doCure();
	Nurse nurse=(Nurse)stanley;
	nurse.doNursing();
	
	HomeoPathyMedicalCollege homeoDoctor=new HomeoPathyMedicalCollege();
	Doctor doctor2=(Doctor)homeoDoctor;
	doctor2.doCure();
	Nurse nurse2=(Nurse)homeoDoctor;//I will get a exception at this line
	nurse2.doNursing();
}
}
interface Doctor{
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
	int i=10;
	//Fields are by default static and final. which means they are constants.
	//interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called....");
	}
	//default methods can be accessed only within the interfaces
	//they are equivalent to template method of abstract classes
}
//interface can extend another interface
interface Surgeon extends Doctor{
	
}
interface Nurse{
	public void doNursing();
}
//implementation class of Interface...
class AlopathyMedicalCollege implements Doctor,Nurse{
@Override
public void doNursing() {
	System.out.println("Nursing method called....");
}
	@Override
	public void doCure() {
		System.out.println("do cure method called..as per alopathy.....");
	}
}
class HomeoPathyMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("do cure method called ... as per homoeopathy...");
	}
}