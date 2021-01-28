import java.util.*;
public class LangFund {
	
	static int calMax(int x,int y,int z) {
		int arr[] = {x,y,z};
		Arrays.sort(arr);
		return arr[2];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/////////// Question 1 ///////////////
		
		System.out.println("Enter 3 nos");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("Maximum: "+calMax(n1,n2,n3));

	}

}
