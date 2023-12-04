
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        
        number = Integer.valueOf(scanner.nextLine());
        
        if (number < 0) {
            number = -1*number;
        }
        
        System.out.println(number);
    }
}
