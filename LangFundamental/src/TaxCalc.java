import java.util.Scanner;

public class TaxCalc {
	static double calTax(int gp) {
		if(gp<=240)
			return 0;
		else if(gp>240 && gp<=480)
			return (double)((gp*15f)/100);
		return (double)((gp*28f)/100);
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		/////////// Question 4 ///////////////
		
		System.out.println("Enter gross pay");
		System.out.println("Tax calculated: "+calTax(sc.nextInt()));
	}
}
