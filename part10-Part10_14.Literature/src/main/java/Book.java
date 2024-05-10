/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Book implements Comparable<Book> {
    private String name;
    private int recommendedAge;

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return name;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }
//
    @Override
    public int compareTo(Book another) {
        if (this.recommendedAge == another.recommendedAge) {
            return this.name.compareTo(another.name);
        }
        return this.recommendedAge - another.recommendedAge;
    }
    
}
