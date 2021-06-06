package basic;
import java.util.Scanner;
public class LeapDemo 
{
	public static void main(String[] args) 
	{
		System.out.printf("Enter any Year:");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		sc.close();
		boolean isLeap = false;
		if(year % 4==0) 
		{
			if(year % 100 == 0) 
			{
				if(year % 400 == 0) 
					isLeap=true;
				else
					isLeap=false;
			}
			else
				isLeap=true;
		}
		else
			isLeap=false;
		
		if(isLeap==true)
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
	}
}
