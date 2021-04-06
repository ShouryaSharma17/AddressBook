import java.util.*;

public class AddressBook {
	
	static Scanner scanner=new Scanner(System.in);
	
	

	public static int contacts()
	{
		//Welcome message
		System.out.println("Welcome to the Address Book!");
		
		//Taking user Input
		System.out.print("Enter the First Name: ");
		String firstName=scanner.nextLine();
		
		System.out.print("Enter the Last Name: ");
		String secondName=scanner.nextLine();
		
		System.out.print("Enter the City Name: ");
		String city=scanner.nextLine();
		
		System.out.print("Enter the State Name: ");
		String state=scanner.nextLine();
		
		System.out.print("Enter the email id: ");
		String emailId=scanner.nextLine();
		

		System.out.print("Enter the Zip Code: ");
		int zipCode=scanner.nextInt();
		
		System.out.print("Enter the Phone number: ");
		int phoneNumber=scanner.nextInt();
		
		
			
		//printing contact details		
		System.out.println("First Name: "+firstName+"| Second Name: "+secondName+"| City: "+city+"| State "
		+state+"| Zip Code:"+zipCode+"| Phone Number:"+phoneNumber+"| Email id: "+emailId);
		return zipCode;
		

	}
	//calling method
	public static void main(String args[]) {
		contacts();
	}
}
