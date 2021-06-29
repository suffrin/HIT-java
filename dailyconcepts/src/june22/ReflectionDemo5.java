package june22;
import java.lang.reflect.Field;
public class ReflectionDemo5 {
	public static void main(String[] args)throws Exception {
		Employee emp=new Employee();
		Class c=emp.getClass();
		Field f=c.getField("name");//dynamically associating with a field
		f.set(emp, "ramu");//dynamically setting a value
		System.out.println("The value set was..:"+f.get(emp));
		
	}
}
class Employee{
	public String name;
	public int age;
	
}