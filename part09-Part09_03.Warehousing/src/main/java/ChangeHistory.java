
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
public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double maxVal = this.changes.get(0);
        for (int i = 0; i < this.changes.size(); i++) {
            if (maxVal < this.changes.get(i)) {
                maxVal = this.changes.get(i);
            }
        }
        return maxVal;
    }
    
    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double minVal = this.changes.get(0);
        for (int i = 0; i < this.changes.size(); i++) {
            if (minVal > this.changes.get(i)) {
                minVal = this.changes.get(i);
            }
        }
        return minVal;
    }
    
    public double average() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < this.changes.size(); i++) {
            total += this.changes.get(i);
        }
        return total/this.changes.size();
    }
    
    public String toString() {
        return this.changes.toString();
    }
}
