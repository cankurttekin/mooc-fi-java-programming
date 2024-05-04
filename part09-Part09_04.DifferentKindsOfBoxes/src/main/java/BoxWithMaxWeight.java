
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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> itemsMax;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsMax = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int max = 0;
        for (Item i : itemsMax) {
            max += i.getWeight();
        }
        
        if (max + item.getWeight() <= this.capacity) {
            itemsMax.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (itemsMax.contains(item)) {
            return true;
        }
        return false;
    }
}
