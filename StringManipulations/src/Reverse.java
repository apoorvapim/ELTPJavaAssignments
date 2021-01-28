import java.util.Scanner;

public class Reverse {

	static String  makeReverse(String str) {
		String res="";
		String words[] = str.split(" ");
		for(String word : words)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(word);
			sb = sb.reverse();
			//System.out.println(sb.toString()+" ");
			res += sb.toString()+" ";
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//////////////Question 4/////////////////
		
		System.out.println("Enter sentence to reverse");
		System.out.println(makeReverse(sc.nextLine()));
	}

}
