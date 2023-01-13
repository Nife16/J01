package weekTwo.Sallys;

import java.util.Scanner;

public class SallysLemonadeStand {

    public static void main(String[] args) {

        Product lemonade = new Product("Sallys Lemonade", 5.00, "Best damn lemonade, that aint spiked");
        Product soda = new Product("Sallys Soda", 3.50, "Dat bubly");
        Product water = new Product("Secret Stuff", 3.00, "The water from space jam");

        int selection = 0;

        while (selection != 4) {
            Scanner scr = new Scanner(System.in);
            System.out.println("WELCOME TO SALLYS LEMONADE!!");
            System.out.println("What can we sell to you today: ");
            System.out.println("1) Best damn Lemonade");
            System.out.println("2) Best damn Sallys Soda");
            System.out.println("3) Best damn water");
            System.out.println("4) Close for maintenance");

            selection = scr.nextInt();


            switch(selection) {
                case 1:                                                              
                    System.out.println("You have selected lemonade,  the price will be " + String.format("%.2f", lemonade.getPrice()));
                break;
                case 2:
                    System.out.println("You have selected Soda,  the price will be " + String.format("%.2f", soda.getPrice()));
                break;
                case 3:
                    System.out.println("You have selected water,  the price will be " + String.format("%.2f", water.getPrice()));
                break;
                case 4:
                    System.out.println("Sally will alow it");
                break;
                default: 
                    System.out.println("Stop it billy");

            }

            System.out.println("Thanks for your patronage!");
        }
        
    }

}
