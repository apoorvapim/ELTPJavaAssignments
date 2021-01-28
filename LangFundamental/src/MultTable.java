
public class MultTable {
	static void multTable() {
		 int arr[][] = new int[13][13];
		 for(int i=1;i<=12;i++)
		 {
			 for(int j=1;j<=12;j++)
			 {
				 arr[i][j] = i*j;
			 }
		 }
		 for(int i=0;i<=12;i++)
		 {
			 for(int j=0;j<=12;j++)
			 {
				 if(i==0 && j==0)
					 System.out.print("\t");
				 else if(i==0)
					 System.out.print(j+"\t");
				 else if(j==0)
					 System.out.print(i+"\t");
				 else
					 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////////// Question 10 ///////////////
		
		multTable();

	}

}
