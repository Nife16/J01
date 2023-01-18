package weekTwo.Sallys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SallysLemonadeStand {

    static List<Suckers> suckersList = new ArrayList<Suckers>();

    static Suckers myFirstSucker = new Suckers("me@me.com", "me", "me", "123ABC", 21, "me123");

    static Product lemonade = new Product("Sallys Lemonade", 5.00, "Best damn lemonade, that aint spiked");
    static Product soda = new Product("Sallys Soda", 3.50, "Dat bubly");
    static Product water = new Product("Secret Stuff", 3.00, "The water from space jam");

    public static void main(String[] args) {

        suckersList.add(myFirstSucker);
        int selection = 0;

        while (selection != 4) {
            Scanner scr = new Scanner(System.in);
            System.out.println("WELCOME TO SALLYS LEMONADE!!");

            System.out.println("1) Sign Up for an account!");
            System.out.println("2) Sign In!");
            System.out.println("3) Enter as a Guest");
            System.out.println("4) Close for maintenance");

            selection = scr.nextInt();
            scr.nextLine();

            switch (selection) {
                case 1:
                    Suckers signedUpSucker = signUp(scr);

                    orderProducts(selection, scr, signedUpSucker);
                    break;
                case 2:

                    break;
                case 3:
                
                    orderProducts(selection, scr, null);

                    break;
                case 4:
                    System.out.println("Sally will alow it");
                    break;
                default:
                    System.out.println("Stop it billy");
            }

        }

    }

    public static Suckers signUp(Scanner scr) {
        System.out.println("Please enter your first name: ");
        String firstName = scr.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scr.nextLine();
        System.out.println("Please enter your age: ");
        Integer age = scr.nextInt();
        scr.nextLine();
        System.out.println("Please enter your phone number: ");
        String phoneNumber = scr.nextLine();
        System.out.println("Please enter your email: ");
        String email = scr.nextLine();
        System.out.println("Please enter your password: ");
        String password = scr.nextLine();

        Suckers sucker = new Suckers(email, firstName, lastName, phoneNumber, age, password);

        Address address = getAddress(scr);

        sucker.setAddress(address);


        suckersList.add(sucker);

        return sucker;
    }

    public static Address getAddress(Scanner scr) {

        System.out.println("Please enter your address information");
        System.out.println("what is your house number: ");
        Integer houseNumber = scr.nextInt();
        scr.nextLine();
        System.out.println("Do you have a unit number ");
        boolean bool = scr.nextBoolean();
        Integer unitNumber = null;
        if(bool) {
            System.out.println("what is your unit number: ");
             unitNumber = scr.nextInt();
             scr.nextLine();
        }
        System.out.println("what is your street name: ");
        String streetName = scr.nextLine();
        System.out.println("what is your city name: ");
        String city = scr.nextLine();
        System.out.println("what is your state name: ");
        String state = scr.nextLine();
        System.out.println("what is your Zip Code: ");
        Integer zipCode = scr.nextInt();
        scr.nextLine();

        Address address = new Address(houseNumber, unitNumber, streetName, city, state, zipCode);

        return address;
        

    }

    public static void signIn(Scanner scr){
        System.out.println("What is your email: ");
        String email = scr.nextLine();
        System.out.println("What is your password: ");
        String password = scr.nextLine();

        boolean bool = true;

        for (int i = 0; i < suckersList.size(); i++) {

            if(email == suckersList.get(i).getEmail() &&
                password == suckersList.get(i).getPassword()) {
                
                orderProducts(null, scr, suckersList.get(i));
                bool = false;
                break;
            }
            
        }

        if(bool) {
            System.out.println("No user found!");
        }
    }

    public static void orderProducts(Integer selection, Scanner scr, Suckers signedUpSucker) {

        System.out.println("What can we sell to you today: ");
        System.out.println("1) Best damn Lemonade");
        System.out.println("2) Best damn Sallys Soda");
        System.out.println("3) Best damn water");

        selection = scr.nextInt();

        switch (selection) {
            case 1:

            // if(signedUpSucker == null) {

            // }
                System.out.println("You have selected lemonade,  the price will be " +
                    String.format("%.2f", lemonade.getPrice(
                        signedUpSucker == null ? 900 : signedUpSucker.getAge()
                    )));
                break;
            case 2:
                System.out.println(
                        "You have selected Soda,  the price will be " +
                        String.format("%.2f", lemonade.getPrice(
                            signedUpSucker == null ? 900 : signedUpSucker.getAge()
                        )));
                break;
            case 3:
                System.out.println(
                        "You have selected water,  the price will be " +
                        String.format("%.2f", lemonade.getPrice(
                            signedUpSucker == null ? 900 : signedUpSucker.getAge()
                        )));
                break;
            default:
                System.out.println("Stop it billy");

        }

        System.out.print("Your items will be shipped to ->  ");
        System.out.println(signedUpSucker.getAddress().toString());
        System.out.println("Thanks for your patronage!");

    }

}
