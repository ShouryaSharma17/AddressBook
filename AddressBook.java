import java.util.Scanner;

public class AddressBook {

    static Scanner scanner=new Scanner(System.in);

    public static  void contacts() {
        //Welcome message
        System.out.println("Welcome to the Address Book!");

        while (true) {
            //Taking user Input
            System.out.print("Enter the First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter the Last Name: ");
            String secondName = scanner.nextLine();

            System.out.print("Enter the City Name: ");
            String city = scanner.nextLine();

            System.out.print("Enter the State Name: ");
            String state = scanner.nextLine();

            System.out.print("Enter the email id: ");
            String emailId = scanner.nextLine();


            System.out.print("Enter the Zip Code: ");
            int zipCode = scanner.nextInt();

            System.out.print("Enter the Phone number: ");
            int phoneNumber = scanner.nextInt();

            System.out.println("Do you want to continue adding contacts? Press Y (yes) or N (No)");
            String option = scanner.next();

            if (option.equalsIgnoreCase("n")) {
                System.out.println("The contact details has been successfully added!");
                //printing contact details
                System.out.println("First Name: " + firstName + "| Second Name: " + secondName + "| City: " + city + "| State "
                        + state + "| Zip Code:" + zipCode + "| Phone Number:" + phoneNumber + "| Email id: " + emailId);
                break;

            }
        }
    }
    //calling method
    public static void main(String args[]) {
        contacts();
    }
}

