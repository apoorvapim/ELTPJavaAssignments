import java.util.Scanner;

public class ElectricBill {

	static double calElecBill(int type, float units)
	 {
		 switch(type)
		 {
		 	case 1:
		 		if(units<=100)
		 		{
		 			if(units*4 <= 250)
		 				return 250;
		 			return units*4f;
		 		}
		 		else if(units>100 && units<=300)
		 			return units*4.5f;
		 		else if(units>300 && units<=500)
		 			return units*4.75f;
		 		else 
		 			return units*5.0f;
		 	case 2:
		 		if(units<=100)
		 		{
		 			if(units*4.25f <= 350)
		 				return 350;
		 			return units*4.25f;
		 		}
		 		else if(units>100 && units<=300)
		 			return units*4.75f;
		 		else if(units>300 && units<=500)
		 			return units*5.0f;
		 		else 
		 			return units*5.25f;
		 }
		 return 0f;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/////////// Question 8 ///////////////
		
		System.out.println("Please select your connection type:");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		int type = sc.nextInt();
		if(type!=1 && type!=2)
		{
			System.out.println("Invalid choice");
			return;
		}
		System.out.println("Enter number of units consumed");
		float units = sc.nextFloat();
		System.out.println("Electricity bill amt: Rs."+calElecBill(type,units));
	}

}
