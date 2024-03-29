package homework;
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        // middle3(42,7,6);
        // xor(true, false);
        // isFactor(3, 43);

        Scanner scr = new Scanner(System.in);
        
        System.out.println("Hi mom, enter in a random number to see if it is prime: ");
        
        int userInput = scr.nextInt();
        
        
        isPrime(userInput);

        scr.close();

    }

    public static boolean isPrime(int numberToCheckForPrime) {

        for (int index = 2; index < numberToCheckForPrime; index++) {

            if (isFactor(numberToCheckForPrime, index)) {
                System.out.println("NOT PRIME");
                return false;
            }
        }
        System.out.println("PRIME");
        return true;

    }

    public static void isPerfect(int userInput) {

        int totalOfFactors = 0;
        for (int i = 1; i < userInput; i++) {

            if (isFactor(userInput, i)) {

                totalOfFactors = totalOfFactors + i;
                // totalOfFactors += i;
            }
            
        }

        if (totalOfFactors == userInput) {
            System.out.println("isPerfect");
        } else {
            System.out.println("not perfect");
        }

    }

    public static boolean isFactor(int numerator, int denomenator) {

        if (denomenator % numerator == 0) {
            System.out.println("Is a factor, True");
            return true;
        } else {
            System.out.println("IS NOT!!!!!, FALSE!!!!");
            return false;
        }

    }

    public static void xor(boolean bool1, boolean bool2) {

        if (bool1 != bool2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void middle3(int num1, int num2, int num3) {

        int total = num1 + num2 + num3;

        int maxNum = maxNumber(num1, num2, num3);
        int minNum = minNumber(num1, num2, num3);

        System.out.println("Middle Number: " + (total - maxNum - minNum));

    }

    public static int minNumber(int num1, int num2, int num3) {

        int minNum;

        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }

        System.out.println("Min Number: " + minNum);
        return minNum;
    }

    public static int maxNumber(int num1, int num2, int num3) {

        int maxNum;

        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }

        System.out.println("Max Number: " + maxNum);
        return maxNum;

    }

}
