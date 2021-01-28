import java.util.*;
class Medicine {
	String name;
	String address;
	Medicine()
	{
		this.name = "";
		this.address = "";
	}
	Medicine(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	void displayLabel()
	{
		System.out.println("Name of the company: "+this.name);
		System.out.println("Address of the company: "+this.address);
	}
	
}
class Tablet extends Medicine {
	@Override
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}
class Ointment extends Medicine {
	@Override
	void displayLabel() {
		System.out.println("For external use only");
	}
	
}
public class TestMedicine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Medicine meds[] = new Medicine[10];
		Random ran = new Random();
		while(true)
		{
			int n = ran.nextInt(3);
			System.out.println(n);
			switch(n)
			{
			case 0:
				meds[n] = new Medicine();
				break;
			case 1:
				meds[n] = new Tablet();
				break;
			case 2:
				meds[n] = new Ointment();
				break;
			}
			meds[n].displayLabel();
			System.out.println("Do you want to continue?(1/0)");
			int c = sc.nextInt();
			if(c==0)
				break;
		}
	}
}
