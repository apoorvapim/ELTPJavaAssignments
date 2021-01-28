import java.util.*;
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int ctr=0;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				ctr++;
			}
		}
		System.out.println("Total no of even nos: "+ctr);
	}

}
