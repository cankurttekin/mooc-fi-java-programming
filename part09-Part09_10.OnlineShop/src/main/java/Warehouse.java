
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public boolean isItInWarehouse(String product) {
        if (this.prices.containsKey(product)) {
            return true;
        }
        return false;
    }
    
    public int price(String product) {
        if (this.isItInWarehouse(product)) {
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (this.isItInWarehouse(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (!this.isItInWarehouse(product)) {
            return false;
        }
        
        if (this.stocks.get(product) <= 1) {
            this.stocks.replace(product, 0);
            return false;
        }
        
        this.stocks.replace(product, this.stocks.get(product)-1);
        return true;
    }
    
    public Set<String> products() {
        Set<String> products = this.prices.keySet();
        return products;
    }
}
