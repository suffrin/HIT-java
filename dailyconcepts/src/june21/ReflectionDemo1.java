package june21;
import java.util.Scanner;
public class ReflectionDemo1 {
	public static void main(String[] args)throws Exception {
		
		//1. static binding.... things which cannot be changed..
		Paint staticPaint=new RedPaint();
		System.out.println("Object created through static way...:"+staticPaint);
		
		//2. dynamic binding.... To dynamically create objects...
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the qualified class name...:");
		String paintClass=scan.next();
		//Where ever the return type of a method is Object, you need to do typecasting
		
		Paint dynamicPaint=(Paint)Class.forName(paintClass).newInstance();
		System.out.println("Object created through dynamic way...:"+dynamicPaint);
		
		//3. new way of creating objects dynamically....after jdk9
		Paint s=(Paint)Class.forName(paintClass).getConstructor().newInstance();
		System.out.println("Object created through new dynamic way...:"+dynamicPaint);
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		
	}
}