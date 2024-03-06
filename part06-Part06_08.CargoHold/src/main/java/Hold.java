
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
public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> holding;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.holding = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.totalWeight += suitcase.totalWeight();
            holding.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase s: holding) {
            s.printItems();
        }
    }
    
    public String toString() {
        return holding.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
