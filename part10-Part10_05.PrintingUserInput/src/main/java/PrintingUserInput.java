
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            inputs.add(input);
        }
        
        //System.out.println(inputs); that passes tests too but for following the course mat.:
        inputs.stream().forEach(s -> System.out.println(s));
    }
}
