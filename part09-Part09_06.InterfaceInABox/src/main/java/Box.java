
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
public class Box implements Packable {
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.box.add(item);
        }
    }
    
    public double weight() {
        double weight = 0;
        for (Packable item : this.box) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
