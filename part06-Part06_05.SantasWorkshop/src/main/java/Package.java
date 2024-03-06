
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
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }
        
        int total = 0;
        
        for (Gift x: gifts) {
            total += x.getWeight();
        }
        return total;
    }
}
