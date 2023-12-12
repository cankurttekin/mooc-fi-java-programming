/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Counter {
    private int count;
    
    public Counter(int startValue) {
        this.count = startValue;
    }
    
    public Counter() {
        this.count = 0;
    }
    
    public int value() {
        return this.count;
    }
    
    public void increase() {
        this.count += 1;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0){
            this.count += increaseBy;
        }
    }
    
    public void decrease() {
        this.count -= 1;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.count -= decreaseBy;
        }
    }
}
