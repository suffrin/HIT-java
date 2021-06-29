package june17;
import java.util.Scanner;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a item..Stick/Biscuit");
		String item=scan.next();		
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
class Dog{
	public void play(String item)throws DogBiteException,DogHappyException {
		if(item.equalsIgnoreCase("stick")) {
			throw new DogBiteException("You beat I bite.....");
		}
		else if(item.equalsIgnoreCase("biscuit")) {
			throw new DogHappyException("I love biscuits....");
		}
	}
}
class Child{
	public void playWithDog(Dog tiger,String item) {
		try{
			tiger.play(item);
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}