import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		System.out.println("Enter id, name, street, city, state, zip, phone");
		c1.id = sc.nextInt();
		c1.name = sc.next();
		c1.setAddress(sc.next(), sc.next(), sc.next(), sc.nextLong());
		c1.setPhoneNum(sc.nextLong(), sc.nextLong(), sc.nextLong());
		c1.show();
	}

}
