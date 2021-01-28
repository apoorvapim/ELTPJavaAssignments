import java.util.Scanner;

public class PrintPrimeNos {

	static void printPrime(int maxVal) {
		 for(int i=2;i<maxVal;i++)
		 {
			 if(DetectPrime.isPrimeNumber(i))
				 System.out.print(i+" ");
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////// Question 6 ///////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum no");
		int max = sc.nextInt();
		printPrime(max);
	}

}
