/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changes;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changes = new ChangeHistory();
        this.changes.add(initialBalance);
    }
    
    public String history() {
        return this.changes.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changes.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double returned = super.takeFromWarehouse(amount);
        this.changes.add(super.getBalance());
        return returned;
    }
    
    public void printAnalysis() {
        System.out.println("Product:" + super.getName());
        System.out.println("History: " + this.changes.toString());
        System.out.println("Largest amount of product: " + this.changes.maxValue());
        System.out.println("Smallest amount of product: " + this.changes.minValue());
        System.out.println("Average: " + this.changes.average());
    }
}
