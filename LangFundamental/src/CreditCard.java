import java.util.Scanner;

public class CreditCard {

	static float calCredit(float amt) {
		 if(amt > 2500)
			 return amt*1.0f/100;
		 if(amt <= 500)
			 return amt*0.25f/100;
		 float f1 = 500*0.25f/100;
		 amt -= 500;
		 if(amt <= 1000)
			 return f1 + (amt*0.5f/100);
		 float f2 = f1 + (amt*0.5f/100);
		 amt -= 1000;
		 if(amt <= 1000)
			 return f2 + (amt*0.75f/100);
		 return amt*1.0f/100;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////// Question 9 ///////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charge amt");
		System.out.println("Payback amt: Rs."+calCredit(sc.nextFloat()));
	}

}
