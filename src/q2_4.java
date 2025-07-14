import java.util.Scanner;

public class q2_4 {
    public static void main(String []args){

        // Print multiplication table (1 to 10) using for loop:

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to see its Multiplication table: ");
        int num = in.nextInt();
        int count;
        for (count=1; count<=10 ;count++){
            System.out.println((num)+" x "+(count)+" = "+ (count*num));
        }

    }
}
