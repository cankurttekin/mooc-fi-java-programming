
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input;
        
        while(true) {
            System.out.println("Shall we carry on?");
            input = scanner.nextLine();
            
            if (input.equals("no")){
                break;
            }
            
        }
    }
}
