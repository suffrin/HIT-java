package june18;
import java.util.Scanner;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a item..Stick/Biscuit");
		String item=scan.next();		
		Item item=new Biscuit();
		baby.playWithDog(tiger, item);
		scan.close();  
	}
}
class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
/*
 * When you override a method, then you cannot throws a exception which is not in the
 * throws of parent
 */
abstract class Item{
	public abstract void execute()throws DogBiteException,DogHappyException;
}
class Stick extends Item{
	@Override
	public void execute()throws DogBiteException {
		throw new DogBiteException("You beat I bite.....");
	}
}
class Biscuit extends Item{
	@Override
	public void execute() throws DogHappyException {
		throw new DogHappyException("I love biscuits....");
	}
}
class Dog{
//	public void play(String item)throws DogBiteException,DogHappyException {
//		if(item.equals("stick")) {
//			throw new DogBiteException("You beat I bite.....");
//		}
//		else if(item.equals("biscuit")) {
//			throw new DogHappyException("I love biscuits....");
//		}
	public void play(Item item) throws DogBiteException,DogHappyException{
		item.execute();
	}
}
class Child{
	public void playWithDog(Dog tiger,Item item) {
		try{
			tiger.play(item);
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}