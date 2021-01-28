import java.util.Scanner;

public class CalcInterest {

	static double calInterest(int amt) {
		if(amt<=1000)
			return (double)((amt*4)/100);
		else if(amt>1000 && amt<=5000)
			return (double)((amt*4.5f)/100);
		return (double)((amt*5)/100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/////////// Question 3 ///////////////
		
		System.out.println("Enter deposit amount");
		int amt = sc.nextInt();
		System.out.println("The interest is: "+calInterest(amt));
	}

}
