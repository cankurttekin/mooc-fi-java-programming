
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int sum = 0;
        int count = 0;
        double avg;
        while(true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                avg = 1.0 * sum / count;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            sum += number;
            count++;
        }
    }
}
