
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        
        while(true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Number of negative numbers: " + count);
                break;
            } else if (number < 0) {
                count++;
            }
        }
    }
}
