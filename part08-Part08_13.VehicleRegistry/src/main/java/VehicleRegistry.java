
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate license : this.registry.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        
        for (String owner : this.registry.values()) {
            if (!printed.contains(owner)) {
                System.out.println(owner);
                printed.add(owner);
            }
            
        }
        
    }
}
