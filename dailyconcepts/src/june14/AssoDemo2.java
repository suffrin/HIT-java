package june14;
public class AssoDemo2 {
	public void eatLaddu1(Laddu l) {
		System.out.println("laddu is eaten now....half");
		l.setSize(5);
	}
	public static void main(String[] args) {
		Laddu laddus=new Laddu();//association - assodemo has knowledge of laddu
		laddus.setSize(10);
		System.out.println("Before eating laddu the size is...:"+laddus.size);
		
		AssoDemo obj=new AssoDemo();
		//passing the object by reference...
		obj.eatLaddu(laddus);
		
		System.out.println("After eating laddu the size is...:"+laddus.size);
	}
}
class Laddu1 {
	int size;
	public void setSize(int size) {//local variables takes precedance over the global variables
		this.size=size;
	}
}