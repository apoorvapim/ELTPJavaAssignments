import java.util.*;

public class StringAssign {
	
	static int check(String sentence,String word){
		int count = 0;
		String arr[] = sentence.split(" ");
		for(String item : arr)
		{
			if(item.equalsIgnoreCase(word))
				count++;
		}
		return count;
	}
	


	
//	static String[]  getCombinations(String str) {
//		char arr[] = str.toCharArray();
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/////////////Question 1///////////////////
		
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		System.out.println("Enter word");
		String word = sc.nextLine();
		System.out.println("Count: "+check(sentence,word));
		

		

		

		

		

		
		//////////////Question 7/////////////////
		
		
		
		
	}

}
