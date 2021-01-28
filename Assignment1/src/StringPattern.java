import java.util.*;
public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		char ch[] = sc.next().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]+" ");
			}
			System.out.println();
		}
	}

}
