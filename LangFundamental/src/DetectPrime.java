import java.util.Scanner;

public class DetectPrime {

	static boolean isPrimeNumber( int num) {
		int ctr = 0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
				ctr++;
		}
		if(ctr==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/////////// Question 5 ///////////////
		
		System.out.println("Enter a no.");
		int num = sc.nextInt();
		if(num==0 || num==1)
		{
			System.out.println("Not applicable: Neither composite, nor prime");
			return;
		}
		boolean res = isPrimeNumber(num);
		if(res)
			System.out.println("Is prime");
		else
			System.out.println("Not prime");
	}

}
