package week02;
import java.util.Scanner;
import java.util.Random;
public class Rock { 
	public static void main(String[] args){ 
		
		String personPlay=""; //User's play -- "R", "P", or "S"
		String computerPlay=""; //Computer's play -- "R", "P", or "S"
		int computerInt=0; //Randomly generated number used to determine computer's play
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome for the Game");
		System.out.println("ROCK-R ");
		System.out.println("PAPER-P ");
		System.out.println("SCISSORS-S");
		do {
		System.out.println();
		System.out.println("Enter your Choice(R, P or S) :");
		String PP= scan.next();
		personPlay=PP.toUpperCase();
		System.out.println("YOUR CHOICE : "+personPlay);
		Random generator = new Random();
		computerInt=generator.nextInt(3);
		//Get player's play -- note that this is stored as a string
		//Make player's play upper case for ease of comparison
		//Generate computer's play (0,1,2)
		//Translate computer's randomly generated play to string
		switch (computerInt) { 
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "P";
			break;
		case 2:
			computerPlay = "S";
			break;
		} 
		System.out.println("COMPUTER CHOICE : "+computerPlay);
		System.out.println();
		//Print computer's play
		//See who won. Use nested if s instead of &&.
		if (personPlay.equals(computerPlay)) {
			System.out.println("It's a tie!"); 
		}
		else if (personPlay.equals("R")) {
			if (computerPlay.equals("S")) {
				System.out.println("~~Congratulations~~");
				System.out.println("Rock crushes scissors. You Won!!"); }
			else {
				System.out.println("~~Try Again~~");
				System.out.println("Paper beats rock . Computer Won!!"); }
		}
		else if (personPlay.equals("P")) {
			if (computerPlay.equals("R")) {
				System.out.println("~~Congratulations~~");
				System.out.println("Paper beats rock. You Won!!");} 
			else {
				System.out.println("~~Try Again~~");
				System.out.println("Scissor cuts paper. Computer Won!!");}
		}
		else if (personPlay.equals("S")) {
			if (computerPlay.equals("P")) {
				System.out.println("~~Congratulations~~");
				System.out.println("Scissor cuts paper. You Won!!!!");} 
			else {
				System.out.println("~~Try Again~~");
				System.out.println("Rock crushes scissors. Computer Won!!");}
		}
		System.out.println();
		System.out.println("Do you want to continue(Y/N) : ");
		} 
	while(scan.next().equalsIgnoreCase("Y"));
	scan.close();
	}
}