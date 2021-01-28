import java.util.Scanner;

public class TicTacToe {

	static String tictactoe(String arr[][]) {
		String line = "";
		for(int i=0;i<8;i++)
		{
			switch(i)
			{
				case 0:
					line = arr[0][0]+arr[0][1]+arr[0][2];
				break;
				case 1:
					line = arr[1][0]+arr[1][1]+arr[1][2];
				break;
				case 2:
					line = arr[2][0]+arr[2][1]+arr[2][2];
				break;
				case 3:
					line = arr[0][2]+arr[1][2]+arr[2][2];
				break;
				case 4:
					line = arr[0][0]+arr[1][0]+arr[2][0];
				break;
				case 5:
					line = arr[0][1]+arr[1][1]+arr[2][1];
				break;
				case 6:
					line = arr[0][0]+arr[1][1]+arr[2][2];
				break;
				case 7:
					line = arr[0][2]+arr[1][1]+arr[2][0];
				break;
			}
			if(line.equalsIgnoreCase("XXX"))
				return "X";
			else if(line.equalsIgnoreCase("OOO"))
				return "O";
		}
		return "Its a tie";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
	//////////////Question 8/////////////////
		
	String arr[][] = new String[3][3];
	System.out.println("Enter the array with X and O");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr[i][j] = sc.next();
		}
	}
	System.out.println("Winner: "+tictactoe(arr));
	}

}
