import java.util.Scanner;

public class q2_5 {
    public static void main(String []atgs){

        // Count digit in a number using While:

        int num, count;
        count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();

        while (num !=0){
            num = num/10;
            ++count;

        }
        System.out.println("The number of digits is: "+ count);



    }
    /* reference :)
    https://www.programiz.com

     */
}
