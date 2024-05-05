
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Herd implements Movable {
    private ArrayList<Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public String toString() {
        String print = "";
        for (Movable movable : this.herds) {
            print += movable.toString() + "\n";
        }
        return print;
    }
    
    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable herd : this.herds) {
            herd.move(dx, dy);
        }
    }
}
