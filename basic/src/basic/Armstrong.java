package basic;

public class Armstrong {
	public static void main(String[] args) {
		int num=153, originalnum, remainder, result=0;
		originalnum = num;
		while(originalnum != 0) {
			remainder= originalnum % 10;
			result+= Math.pow(remainder, 3);
			originalnum/= 10;	
		}
		if(result==num) 
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");	
	}
}
