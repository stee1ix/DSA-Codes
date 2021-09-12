package Searching.Linear;

public class FindEven {

    public static void main(String[] args) {
        int[] num = {12, 344655, 2, 5, 4798};
        System.out.println(findNumber(num));
        System.out.println(digits2(-545));
    }

    private static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check whether a no. contains even no. of digits or not
    //approaches: count the no. of digits; convert the integer to string and take the length
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    //count the number of digits in a number
    private static int digits(int num) {
        //if number is -ve then make it +ve
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //faster counting
    private static int digits2(int num) {
        //if number is -ve then make it +ve
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        return (int) (Math.log10(num) + 1); //log10 for no. of digits in decimal representation of the number, log2 for binary, log8 for octal
    }
}
