
import java.util.ArrayList;
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
public class BirdWatcher {
    private ArrayList<Bird> birds;
    private Scanner scan;
    
    public BirdWatcher(Scanner scan) {
        this.birds = new ArrayList<Bird>();
        this.scan = scan;
    }
    
    public void addBird() {
        System.out.print("\nName: ");
        String name = this.scan.next();
        
        System.out.print("\nName in Latin: ");
        String latinName = this.scan.next();
        
        this.birds.add(new Bird(name, latinName));
    }
    
    public boolean observation() {
        System.out.print("\nBird? ");
        String name = this.scan.next();
        
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.observeCount();
                return true;
            }
        }
        System.out.println("Not a bird!");
        return false;
    }
    
    public boolean birdWatcherUI() {
        System.out.print("? ");
        String input = this.scan.next();
        
        if (input.equals("Add")) {
            addBird();
        } else if (input.equals("Observation")) {
            observation();
        } else if (input.equals("All")) {
            for (Bird bird : this.birds) {
                System.out.println(bird);
            }
        } else if (input.equals("One")) {
            System.out.print("Bird? ");
            input = scan.next();
            for (Bird bird : this.birds) {
                if(bird.getName().equals(input)) {
                    System.out.println(bird);
                }
            }
        } else if (input.equals("Quit")) {
            return false;
        }
        return true;
    }
}
