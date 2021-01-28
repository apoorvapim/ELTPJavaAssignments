import java.util.Scanner;

public class CheckVowel {

	static boolean checkAlpha(char alph) {
		if(alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u')
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/////////// Question 2 ///////////////
		
		System.out.println("Enter the alphabet");
		char c = sc.next().toLowerCase().charAt(0);
		boolean res = checkAlpha(c);
		if(res)
			System.out.println("Is a vowel");
		else
			System.out.println("Not a vowel");
	}

}
