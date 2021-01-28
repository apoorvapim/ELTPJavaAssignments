import java.util.Scanner;

public class StringReplace {

	static String findReplace(String sen,String src, String des) {
		sen = sen.toLowerCase();
		src = src.toLowerCase();
		//des = des.toLowerCase();
		String s1 = sen.replaceAll(src, des);
		return s1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//////////////Question 5/////////////////
		
		System.out.println("Enter the sentence");
		String sen = sc.nextLine();
		System.out.println("Enter source string and the new string");
		String src = sc.next();
		String des = sc.next();
		System.out.println(findReplace(sen,src,des));
		
	}

}
