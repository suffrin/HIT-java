package june9;
public class SwitchCaseDemo {
	public static void main(String[] args) {
		SwitchCaseDemo obj=new SwitchCaseDemo();
		obj.met('a');
		obj.met(8);
		obj.met("hello");
	}
	void met(String s) {
		switch(s) {
		case "helloworld":{
			System.out.println("the value is hello world....");
			break;
		}
		case "hello":{
			System.out.println("the value is hello............");
			break;
		}
		default:{
			
		}
		}
	}
	void met(int i) {
		switch(i){
		case 10:{
			System.out.println("the value is 10....");
			break;
		}
		case 9:{
			System.out.println("the value is 9....");
			break;
		}
		default:{
			System.out.println("the value is neither 9 nor 10");
		}
		}
	}
	void met(char c) {
		switch(c) {
		case 'c':{
			System.out.println("the value is c....");
			break;
		}
		default:{
			System.out.println("this is default block....");
			break;
		}
		case 'a':{
			System.out.println("you have choosen the right one..");
			System.out.println("the value is aaaaaaaaaaa");
			break;
		}
		case 'b':{
			System.out.println("the value is b....");
		}
		
		}
	}
}