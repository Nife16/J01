package weekOne;

public class Practice {

    public static void main(String[] args) {

        int[] digits = {1,4,2,1};
        plusOne(digits);

    }

    /*
     * Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].
     */

    public static void plusOne(int[] digits) {

        String number = "";
        for (int i = 0; i < digits.length; i++) {
            
            number = number + digits[i];

        }

        System.out.println(number);

        int stringNumber = Integer.parseInt(number);
        stringNumber++;

        String backtOString = Integer.toString(stringNumber);

        int[] newArr = new int[backtOString.length()];
        for (int i = 0; i < backtOString.length(); i++) {
            newArr[i] = (int) backtOString.charAt(i);
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }

    }

}
