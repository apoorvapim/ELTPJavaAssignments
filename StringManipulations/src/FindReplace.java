import java.util.Scanner;

public class FindReplace {

	static String[] initProductNames() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter product names");
		String prodNames[] = (s.nextLine().split(" "));
		return prodNames;
	}
	static boolean isPresent(String[] productNames, String keyword) {
		for(String item : productNames)
		{
			if(item.contains(keyword))
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//////////////Question 2/////////////////
		
		String prodNames[] = initProductNames();
		System.out.println("Enter keyword");
		String keyword = sc.nextLine();
		System.out.println(isPresent(prodNames,keyword));
	}

}
