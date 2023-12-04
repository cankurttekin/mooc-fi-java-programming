
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        int sum = 0;
        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());
        
        sum = first + second;
        
                
        System.out.println(Math.sqrt(sum));

    }
}
