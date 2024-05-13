/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Hideout<T> {
    private T hide;
    
    public void putIntoHideout(T toHide) {
        this.hide = toHide;
    }
    
    public T takeFromHideout() {
        T toReturn = this.hide;
        this.hide = null;
        return toReturn;
    }
    
    public boolean isInHideout() {
        return this.hide != null;
    }
}
