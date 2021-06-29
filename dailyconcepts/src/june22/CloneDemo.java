package june22;
public class CloneDemo {
	public static void main(String[] args) {
		Sheep mothersheep=new Sheep();
		mothersheep.name="i am the mother sheep...";
		
		//Sheep dolly=new Sheep();//multiton - RESOURCE NOT SHARED & PROEPRTIES NOT SHARED
		//Sheep dolly=mothersheep;//singleton - RESOURCE SHARED & PROPERTIES SHARED
		Sheep dolly=mothersheep.createClone();//cloning...PROTOTYPE-PROTOTYPE PATTERN
		//In case of clone...Resources are shared but properties are unique.
		//which means... only one object of the sheep will get created but still properties will be unique
		dolly.name="I am the clone dolly...";
		
		System.out.println("Mother name...:"+mothersheep.name);
		System.out.println("Clone Name...:"+dolly.name);
		/*
		 * Scenario 1 - Two objects - two datas - problem here is memory is spent more. adv - data safe.
		 * Scenario 2 - One Object - two datas - advantage here is memory saved, but the data is shared.
		 * So in first case, data is safe but memory is wasted
		 * in second case - memory is not wasted, but data is not safe...
		 *
		 * Solution
		 * 1. Memory should not be wasted.
		 * 2. Data also should be safe
		 * - clone - in clone - Resources are shared but properties are unique...
		 * 		 */
	}
}
class Sheep implements Cloneable{
	public Sheep() {
		System.out.println("sheep object created....");
	}
	public String name;
	
	public Sheep createClone() {
		try {
			return (Sheep)super.clone();
		}catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
			return null;
		}
	}
}