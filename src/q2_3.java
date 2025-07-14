import java.util.Scanner;

public class q2_3 {
    public  static void main (String[]args){

        // Use switch to display the name of the day (1 t0 7)

        int day;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the day from 1 to 7: ");
        day = in.nextInt();
        switch (day){
            case 1:
                System.out.printf("Day number %d is Sunday.",day);
                break;
            case 2:
                System.out.printf("Day number %d is Monday.",day);
                break;
            case 3:
                System.out.printf("Day number %d is Tuesday.", day);
                break;
            case 4:
                System.out.printf("Day number %d is Wednesday.", day);
                break;
            case 5:
                System.out.printf("Day number %d is Thursday.", day);
                break;
            case 6:
                System.out.printf("Day number %d is Friday.", day);
                break;
            case 7:
                System.out.printf("Day number %d is Saturday.", day);
                break;
            default:
                System.out.println("Invalid Value");
        }


    }
}
