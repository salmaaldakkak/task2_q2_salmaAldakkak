import java.util.Scanner;

public class q2_6 {

    public static void main(String[]args) {

        // Reverse a number using while:

        int num;
        int numRev = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();


        if (num < 0) { // if the user enters a negative number, print '-' and make it positive 3ashan the loop below only works with positive values
            System.out.print("-");
            num = -num;
        }

        System.out.print("Reversed number= ");

        while (num != 0) {
            int digit = num % 10; // to store the last digit in the number
            System.out.print(digit); // to print the digits in reversed هيطبعهم بالترتيب جنب بعض كل مرة اللوب تشتغل
            num = (num - digit) / 10; // to remove that last digit from the number
        }
    }
}
