
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && !(amount < 0)) {
                if(firstContainer+amount <= 100) {
                    firstContainer += amount;
                    amount = 0;
                } else {
                    firstContainer = 100;
                }
                
            }
            
            if (command.equals("move")) {
                if(secondContainer+amount <= 100) {
                    if(firstContainer-amount < 0) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else {
                        firstContainer -= amount;
                        secondContainer += amount;
                    }
                    amount = 0;
                } else if(secondContainer+amount > 100){
                    firstContainer -= amount;
                    secondContainer = 100;
                }
            }
            
            if (command.equals("remove")) {
                if(secondContainer-amount <= 0) {
                    secondContainer = 0;
                    amount = 0;
                } else {
                    secondContainer -= amount;
                }
                
            }
            
            command = "";
            amount = 0;

        }
    }

}
