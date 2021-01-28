import java.util.*;
public class CountSpaces {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int ctr = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				ctr++;
		}
		System.out.println("Total spaces: "+ctr);
	}
}
