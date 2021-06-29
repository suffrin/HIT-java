package june9;
//method_overloading
public class Service108 {
	void help(Police p) {
		System.out.println("the caller is a police man... let connect with control room");
	}
	void help(AccidentVictim a) {
		System.out.println("the caller is a accident victim...let connect with doctor...");
	}
	void help(Helper h) {
		System.out.println("the caller is a helper....let us help him....");
	}
//	void help(Object o) {
//		if(o instanceof Police) {
//			System.out.println("police...");
//		}
//		else if(o instanceof AccidentVictim) {
//			System.out.println("accident victim...");
//		}
//		else if(o instanceof Helper) {
//			System.out.println("write logic for helper...");
//		}
//	}
	
	public static void main(String[] args) {
		Service108 obj108=new Service108();
		Police captain=new Police();
		AccidentVictim ac=new AccidentVictim();
		Helper ramasamy=new Helper();
		
		obj108.help(ramasamy);
		obj108.help(ac);
		obj108.help(captain);
	}
}
class Police{
	
}
class AccidentVictim{
	
}
class Helper{
	
}