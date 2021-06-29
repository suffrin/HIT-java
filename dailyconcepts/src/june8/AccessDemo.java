package june8;
public class AccessDemo {
	public int pub;
	protected int pro;
	int nomod;
	private int pri;
	
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
}
class AccessDemoSubClass extends AccessDemo{//I have created a subclass
	
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		//System.out.println(pri);
	}
}
class AccessDemoNonSubClass {
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
		//System.out.println(obj.pri);
	}
}