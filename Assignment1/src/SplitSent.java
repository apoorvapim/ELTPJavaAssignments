import java.util.*;
public class SplitSent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String words[] = sc.nextLine().split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}

}
