
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight()+ item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
        
    }
    
    public void printItems() {
        for(Item i: items) {
            System.out.println(i.getName() + " (" +i.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for(Item i: items) {
            total += i.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        for(Item i: items) {
            if(i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() ==1) {
            return "1 item (" + items.get(0).getWeight() + " kg)";
        }
        
        return items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
