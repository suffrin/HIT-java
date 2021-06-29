package june8;

public class ArrayDemo {
	int marks[]= {10,20,40,50};
	int score[]=new int[6];
	void met() {
		score[0]=100;
		score[1]=90;
		score[2]=100;
		score[3]=100;
		score[4]=70;
		score[5]=97;
		//score[6]=89;
		System.out.println("all scores are noted");
		
	}
	public static void main(String[] args) {
		System.out.println("Inside of main function");
		ArrayDemo ar = new ArrayDemo();
		ar.met();//also new ArrayDemo().met();
		System.out.printf("Ended tata...!");
	}
}