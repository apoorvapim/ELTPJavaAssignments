import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine().toLowerCase();
		int ctr=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				ctr++;
		}
		System.out.println("Total vowels: "+ctr);
	}

}
