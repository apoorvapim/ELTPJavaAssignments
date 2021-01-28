import java.util.Scanner;

public class PrimeNo {

	static int[] findPrime() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no of values");
		int n = s.nextInt();
		int k=0;
		int arr[] = new int[n];
		int inp[] = new int[n];
		System.out.println("Enter the nos");
		for(int i=0;i<n;i++)
		{
			inp[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			//int num = s.nextInt();
			int ctr=0;
			for(int j=1;j<=inp[i]/2;j++)
			{
				if(inp[i]%j==0)
				{
					ctr++;
				}
			}
			if(ctr==1)
			{
				arr[k]=inp[i];
				k++;
			}
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////////////Question 6/////////////////
		
		int arr[] = findPrime();
		for(int i=0;i<arr.length && arr[i]!=0;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
