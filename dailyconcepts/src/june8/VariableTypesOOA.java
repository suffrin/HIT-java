package june8;
public class VariableTypesOOA {
	int i=10; //instance variable
	static int s=100;//class variable
	void met() {
		int j=10;//local variable
	}
	public static void main(String[] args) {
		TrainingRoom gandhi=new TrainingRoom();
		TrainingRoom nehru=new TrainingRoom();
		gandhi.teach();gandhi.teach();gandhi.teach();
		nehru.teach();nehru.teach();
	}
}
class TrainingRoom{
	public TrainingRoom() {
		System.out.println("training room object created...");
	}
	Projector pro=new Projector();//instance variable
	static Toilet toilet=new Toilet();//class variable
	void teach() {
		Student s=new Student();//local variable
	}
}
class Projector{
	//Constructor
	public Projector() {//the name of the constructor and class should be same
		System.out.println("projector object created...");
	}
} //in one training room only one projector will be present
class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
}//for many training rooms, one toilet can be used
class Student{
	public Student() {
		System.out.println("student object created....");
	}
}//in one training room manys students will sit
