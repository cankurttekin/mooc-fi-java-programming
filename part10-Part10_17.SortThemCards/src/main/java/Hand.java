
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand other) {
        return this.hand.stream().mapToInt(Card::getValue).sum() - other.hand.stream().mapToInt(Card::getValue).sum();
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
