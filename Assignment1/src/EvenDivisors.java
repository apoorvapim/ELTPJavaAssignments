import java.util.*;
public class EvenDivisors {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 nos in array");
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2==0 && arr[i]%5==0)
				System.out.println(arr[i]);
		}
	}

}
