
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    
    public void start() {        
        while(true) {
            if(this.commands()) {
                continue;
            } else {
                break;
            }
        }
    }
    
    public boolean commands() {
        System.out.print("Command: ");
        String command = scanner.next();
            
        if(command.equals("end")) {
            System.out.println("Bye bye!");
            return false;
        }
        
        if(command.equals("add")) {
            System.out.print("Word: ");
            String word = scanner.next();
            System.out.println("");
            System.out.print("Translation: ");
            String translation = scanner.next();
            simpleDict.add(word, translation);
            return true;
        }
        
        if(command.equals("search")) {
            System.out.print("To be translated: ");
            String word = scanner.next();
            System.out.println("");
            if(simpleDict.translate(word) == null) {
                System.out.println("Word " + word + " was not found");
                return true;
            }
            System.out.print("Translation: " + simpleDict.translate(word));
            return true;
        }
        System.out.println("Unknown command");
        return true;
    }
}
