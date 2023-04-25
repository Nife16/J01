package weekOne;

// Write a method called "middle3" that computes the MIDDLE value of THREE integers. Hint: for the case of three numbers, the middle is the value that is NOT the maximum NOR the minimum, so add the three values and subtract out the min and max, using the methods you wrote for problems #1 and #2
//Write a method called "xor" that takes two boolean values (either true or false) and returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them
//Write a method "isFactor" which takes two integers (k and n) and returns true if ("if and only if") k is a factor of n.
public class Practice {

    public static void findMaxNumber(int a, int b, int c) {

        int max = 0;
        while (a > 0 || b > 0 || c > 0) {
            a--;
            b--;
            c--;
            max++;
        }

        System.out.println(max);
    }

    public static void findMinNumber(int a, int b, int c) {

        int min = 0;
        while (a > 0 && b > 0 && c > 0) {
            a--;
            b--;
            c--;
            min++;
        }
        System.out.println(min);
    }

    public static void findMiddleThreeNumbers(int a, int b, int c) {

        if ((a > b && a > c) || (b < c && c < a))
            System.out.println(c + "is the middle number");
        {

        }
    }

    public static void printMessage() {
        System.out.println("The fridge is running today");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
        {

        }
    }

    public static void main(String[] args) {

        findMaxNumber(40, 10, 20);
        findMaxNumber(100, 30, 50);
        findMaxNumber(50, 20, 30);
        findMaxNumber(250, 100, 150);
        findMinNumber(25, 15, 20);
        findMinNumber(450, 200, 400);
        findMinNumber(3000, 1550, 1800);
        findMiddleThreeNumbers(2500, 2000, 2350);
        findMiddleThreeNumbers(550, 400, 450);
        findMiddleThreeNumbers(5000, 2500, 3000);
        printMessage();
        add(10, 22);

    }

}