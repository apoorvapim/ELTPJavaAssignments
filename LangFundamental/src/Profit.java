import java.util.Scanner;

public class Profit {

	static float calculateProfit( int numAttendees) {
		 return 5*numAttendees - 20 - numAttendees*0.5f;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////// Question 7 ///////////////
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of attendees");
		System.out.println("Profit earned: Rs."+calculateProfit(sc.nextInt()));
	}

}
