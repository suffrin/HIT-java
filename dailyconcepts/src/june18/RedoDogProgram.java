package june18;
public class RedoDogProgram {
	public static void main(String[] args) {
		Child1 ramu=new Child1();
		Dog tiger=new Dog();
		
		Item item=new Stone();
		
		ramu.playWithDog(tiger, item);
	}
}
abstract class DogExceptions extends Exception{
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
abstract class Item1{
	public abstract void execute()throws DogExceptions;
}
class Stick1 extends Item1{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBiteException("You beat I bite.....");
	}
}
class Stone extends Item{
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException("you hit I bark.........");
	}
}
class Dog1{
	public void play(Item item) throws DogExceptions{
		item.execute();
	}
}
class Child1{
	public void playWithDog(Dog tiger,Item item) {
		try {
			tiger.play(item);
		}catch(DogExceptions de) {
			System.out.println(de);
		}
	}
}

