
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class UserInterface {
    private TodoList todo;
    private Scanner scan;
    
    public UserInterface(TodoList todo, Scanner scan) {
        this.todo = todo;
        this.scan = scan;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            
            if(command.equals("stop")) {
                break;
                
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = this.scan.nextInt();
                this.todo.remove(toRemove);
                
            } else if(command.equals("list")) {
                this.todo.print();
                
            } else if(command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = this.scan.nextLine();
                this.todo.add(toAdd);
            }
        }
    }
}
