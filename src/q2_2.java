import java.util.Scanner;

public class q2_2 {
    public static void main (String[]args){

        // Use if to check the number is even or odd

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = in.nextInt();

        if (num%2 ==0){
            System.out.printf("The number ( %d ) is even.", num);
        } else {
            System.out.printf("The number ( %d ) is odd.", num);
        }



    }
}
