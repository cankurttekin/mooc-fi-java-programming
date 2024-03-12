
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if(secondContainer.contains() + amount <= 100 && firstContainer.contains() - amount >= 0) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    int buffer = firstContainer.contains();
                    firstContainer.remove(firstContainer.contains());
                    secondContainer.add(firstContainer.contains() + buffer);
                }
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
            
            command = "";
            amount = 0;

        }

        
    }

}
