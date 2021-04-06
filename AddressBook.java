import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

//import static java.lang.System.*;

public class AddressBook {

    static Scanner detail=new Scanner(System.in);


    public static  void contacts() {
        //Welcome message
        System.out.println("Welcome to the Address Book!");

        ArrayList<String> firstName = new ArrayList<String>();
        ArrayList<String> lastName = new ArrayList<String>();
        ArrayList<String> city = new ArrayList<String>();
        ArrayList<String> state = new ArrayList<String>();
        ArrayList<Integer> zipCode = new ArrayList<Integer>();
        ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
        ArrayList<String> emailId = new ArrayList<String>();

        while (true) {
            //Taking user Input
            System.out.print("Enter the First Name: ");
            firstName.add(detail.next());

            System.out.print("Enter the Last Name: ");
            lastName.add(detail.next());

            System.out.print("Enter the City Name: ");
            city.add(detail.next());

            System.out.print("Enter the State Name: ");
            state.add(detail.next());

            System.out.print("Enter the email id: ");
            emailId.add(detail.next());

            System.out.print("Enter the Zip Code: ");
            zipCode.add(detail.nextInt());

            System.out.print("Enter the Phone number: ");
            phoneNumber.add(detail.nextInt());

            System.out.println("Do you want to continue adding contacts? Press Y (yes) or N (No)");
            String option = detail.next();

            if (option.equalsIgnoreCase("n")) {
                System.out.println("The contact details has been successfully added!");
                //printing contact details
                System.out.println("First Name: " + firstName + "| Second Name: " + lastName + "| City: " + city + "| State "
                        + state + "| Zip Code:" + zipCode + "| Phone Number:" + phoneNumber + "| Email id: " + emailId);
                break;
            }

        }
        //code for editing contact details
        System.out.println("Do you want to edit any contact? Press Y or N ");
        String editDetail = detail.next();

        if (editDetail.equalsIgnoreCase("y")) {
            System.out.println("Enter the first name of the contact");
            String checkName = detail.next();

            //taking new details to replace the older one
            if (firstName.contains(checkName)) {
                System.out.println("The name is present");
                int pos = firstName.indexOf(checkName);

                System.out.print("Enter the First Name: ");
                String editFirstName = detail.next();

                System.out.print("Enter the Last Name: ");
                String editLastName = detail.next();

                System.out.print("Enter the City Name: ");
                String editCity = detail.next();

                System.out.print("Enter the State Name: ");
                String editState = detail.next();

                System.out.print("Enter the Email id: ");
                String editEmailId = detail.next();

                System.out.print("Enter the Zip: ");
                int editZipCode = detail.nextInt();

                System.out.print("Enter the phone number: ");
                int editPhoneNumber = detail.nextInt();

                //setting the new details
                firstName.set(pos, editFirstName);
                lastName.set(pos, editLastName);
                city.set(pos, editCity);
                state.set(pos, editState);
                emailId.set(pos, editEmailId);
                zipCode.set(pos, editZipCode);
                phoneNumber.set(pos, editPhoneNumber);

                //printing edited details
                System.out.println("The contact detail has been successfully edited" + firstName + lastName + city + state + zipCode + phoneNumber + emailId);

            } else {
                System.out.println("The name is not present in the Address Book");

            }

        }

        //code for deleting a contact detail
        System.out.println("Do you want to delete a contact detail? Press Y or N");
        String deleteOption = detail.next();

        if (deleteOption.equalsIgnoreCase("y"))
        {

            System.out.println("Enter the first name");
            String deleteName = detail.next();
            int pos1 = firstName.indexOf(deleteName);
            firstName.remove(pos1);
            lastName.remove(pos1);
            city.remove(pos1);
            state.remove(pos1);
            emailId.remove(pos1);
            zipCode.remove(pos1);
            phoneNumber.remove(pos1);

            System.out.println("The contact detail has been successfully deleted " + firstName + lastName + city + state + zipCode + phoneNumber + emailId);

        }
        else{
            System.out.println("Thank you");
            
        }

    }


    //calling method
    public static void main(String args[]) {
        contacts();
    }
}

