package june16;
public class TemplateMethodDemo {
	public static void main(String[] args) {
		Sangeetha sangeethaHotel=new ShoiabSangeethaRestaurant();
		sangeethaHotel.process();
	}
}
abstract class Sangeetha{
	public final void uniform() {
		System.out.println("uniform defined by sangeetha...");
	}
	public final void serve() {
		System.out.println("sangeetha defines how to serve...");
	}
	public abstract void makeIdly();
	
	public final void createIdlyPlate() {
		System.out.println("sangeetha define how to create a idly plate...");
	}
	public final void charge() {
		System.out.println("sangeetha define how much to charge....");
	}
	public final void process() {//Template method...
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}
class ShoiabSangeethaRestaurant extends Sangeetha{
	@Override
	public void makeIdly() {
		System.out.println("my grandma makes the idly in my hotel.....");
	}
	
}
