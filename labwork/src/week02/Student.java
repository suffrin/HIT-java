package week02;
class Stud {
		String name,city;
		int age;
		static int m;
		void printData() {
			System.out.println("StudentName : "+name);
			System.out.println("StudentCity : "+city);
			System.out.println("StudentAge : "+age);
		}
}
public class Student{
	public static void main(String args[]) {
		Stud s1=new Stud();
		Stud s2=new Stud();
		s1.name="Suffrin";
		s1.city="Madurai";
		s1.age=978;
		s2.name="Irfana";
		s2.city="Mumbai";
		s2.age=458;
		s2.printData();
		
		s1.printData();
		s2.m=22;
		s1.m=20;
		Stud.m=27;
			System.out.println("s1.m="+s1.m);
			System.out.println("s2.m="+s2.m);
			System.out.println("Stud.m="+Stud.m);
	}
}