
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int count = 0;
        int sum = 0;
        double avg;
        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                if (count <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                avg = 1.0 * sum / count;
                System.out.println(avg);
                break;
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }
    }
}
