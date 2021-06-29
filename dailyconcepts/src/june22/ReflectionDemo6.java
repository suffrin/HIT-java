package june22;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionDemo6 {
	public static void main(String[] args) {
		BadPolitician bp=new BadPolitician();
		PoliceStation p1=new PoliceStation();
		p1.interrogate(bp);
	}
}
class PoliceStation{
	public void interrogate(BadPolitician bp) {
		System.out.println(bp.name);
		bp.service();
		tortureRoom(bp);
	}
	public void tortureRoom(BadPolitician bp) {
		try {
		Class c=bp.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(bp));
		
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(bp);
		
		Field ff[]=c.getDeclaredFields();
		for(Field field:ff) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}
		
		Method mm[]=c.getDeclaredMethods();
		for(Method method:mm) {
			method.setAccessible(true);
			System.out.println(method.getName());
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class BadPolitician{
	public String name="I am a good man...";
	private String secretName="I am a bla bla bla...";
	
	public void service() {
		System.out.println("I do social service.....");
	}
	private void secretService() {
		System.out.println("I do bla bla bla......");
	}
}