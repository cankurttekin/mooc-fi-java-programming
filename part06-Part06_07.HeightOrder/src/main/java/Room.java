
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
public class Room {
    private ArrayList<Person> peopleInRoom;
    
    public Room() {
        this.peopleInRoom = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.peopleInRoom.add(person);
    }
    
    public boolean isEmpty() {
        if (this.peopleInRoom.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.peopleInRoom;
    }
    
    public Person shortest() {
        if(peopleInRoom.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.peopleInRoom.get(0);
        
        for (Person i: peopleInRoom) {
            if (i.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = i;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        this.peopleInRoom.remove(shortest);
        return shortest;
    }
}
