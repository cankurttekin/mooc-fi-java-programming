/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Literacy/* implements Comparable<Literacy>*/ {
    private String theme;
    private int ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacy;

    public Literacy(String gender, String country, int year, double literacy) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacy = literacy;
    }
    
    public double getLiteracy() {
        return this.literacy;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacy;

    }
    /*
    @Override
    public int compareTo(Literacy lit) {
        if(this.getLiteracy() > lit.getLiteracy()) {
            return 1;
        } else if(this.getLiteracy() < lit.getLiteracy()) {
            return -1;
        } else {
            return 0;
        }
    }
    */
}
