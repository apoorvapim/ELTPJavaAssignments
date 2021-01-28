import java.util.Scanner;

public class FindNum {

	static int findPosition(int num,int[] nos) {
		for(int i=0;i<nos.length;i++)
		{
			if(num==nos[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//////////////Question 3/////////////////
		
		System.out.println("Enter length of list");
		int len = sc.nextInt();
		System.out.println("Enter the numbers");
		int nos[] = new int[len];
		for(int i=0;i<len;i++)
		{
			nos[i] = sc.nextInt();
		}
		System.out.println("Enter no.");
		int num = sc.nextInt();
		System.out.println("Position: "+findPosition(num,nos));
	}

}
