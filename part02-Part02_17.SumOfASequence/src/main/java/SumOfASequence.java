
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Last number? ");
        n = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
