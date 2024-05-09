
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while(true) {
            int input = scanner.nextInt();
            if(input < 0) {
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream().filter(i -> i >= 0 && i <= 5).forEach(i -> System.out.println(i));
    }
}
