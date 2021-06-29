package june21;
public class ReflectionDemo2 {
	public static void main(String[] args)throws Exception {
		Politician p=new AbcPolitician("ramu","father ramu");
		System.out.println(p);
		
		//dynamic way...  old one...
		p=(Politician)Class.forName("hit.day16.AbcPolitician")
				.getConstructor(new Class[] {String.class,String.class}).newInstance("dynamicramu","dynamic father ramu");
		
		System.out.println("dynamic ramu...:"+p);
		//dynamic way .... new one  (they have achieved this through VARARGS
		p=(Politician)Class.forName("hit.day16.AbcPolitician")
				.getConstructor(String.class,String.class).newInstance("new dynamicramu","new father dynamic ramu");
		
		System.out.println("new dynamic ramu...:"+p);
	}
}
abstract class Politician {
	
}
class AbcPolitician extends Politician{
	String name;String fname;
	public AbcPolitician(String name,String fname) {
		this.name=name;this.fname=fname;
	}
	@Override
	public String toString() {
		return "The object is..:"+this.name+":"+this.fname;
	}
}
class XyzPolitician  extends Politician{
	
}