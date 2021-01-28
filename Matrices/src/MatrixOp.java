import java.util.*;

public class MatrixOp {
	
	static void addMatrix(int r1, int c1, int mat1[][], int mat2[][]) {
		
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(mat1[i][j]+mat2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	static void mulMatrix(int r1, int c1, int mat1[][], int c2, int mat2[][]) {
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				int val = mul(i,j,c1,mat1,mat2);
				System.out.print(val+"\t");
			}
			System.out.println();
		}
	}
	static int mul(int r, int c, int max, int mat1[][], int mat2[][]) {
		int ans = 0;
		for(int i=0;i<max;i++)
		{
			ans += mat1[r][i]*mat2[i][c];
		}
		return ans;
	}
	
	static void trans(int r, int c, int mat[][]) {
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(mat[j][i]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions of matrix 1");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int mat1[][] = new int[r1][c1];
		System.out.println("Enter the matrix");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter dimensions of matrix 2");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int mat2[][] = new int[r2][c2];
		System.out.println("Enter the matrix");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				mat2[i][j] = sc.nextInt();
			}
		}
		if(r1!=r2 || c1!=c2)
			System.out.println("Cannot perform addition! Matrices should have same dimensions");
		else
		{
			System.out.println("Result of addition: ");
			addMatrix(r1,c1,mat1,mat2);
		}
		if(c1!=r2)
			System.out.println("Cannot perform multiplication! Matrices have incompatible dimensions");
		else
		{
			System.out.println("Result of multiplication: ");
			mulMatrix(r1,c1,mat1,c2,mat2);
		}
		System.out.println("Transpose of mat1: ");
		trans(r1,c1,mat1);
		System.out.println("Transpose of mat2: ");
		trans(r2,c2,mat2);
	}
}
