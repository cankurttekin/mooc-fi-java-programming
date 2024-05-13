
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> posNums = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input > 0) {
                posNums.add(input);
            }
            
        }
        if (posNums.isEmpty()) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(posNums.stream().mapToInt(num -> num).average());
    }
}
