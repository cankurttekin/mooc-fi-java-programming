
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
public class OneItemBox extends Box {
    private ArrayList<Item> oneBox;
    
    public OneItemBox() {
        this.oneBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneBox.isEmpty()) {
            this.oneBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneBox.contains(item);
    }
}
