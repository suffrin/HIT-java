package june17;
public class ExceptionDemo6 {
	public static void main(String[] args) {
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("invalid");
		}
		catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action or logic ....for invalid card...");
		}
		System.out.println("normal transaction....");
	}
}
class ATM{
	public void insertCard(String cardValidity)throws InvalidCardException {
		if(cardValidity.equals("valid")) {
			System.out.println("I will process the card....");
		}
		else {
				throw new InvalidCardException("You have inserted a invalid card....");	
			}
		}
}