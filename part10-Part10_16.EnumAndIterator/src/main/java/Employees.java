
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private List<Person> emps;

    
    public Employees() {
        this.emps = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.emps.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        //this.emps.addAll(peopleToAdd);
        peopleToAdd.stream().forEach(person -> Employees.this.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator = emps.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = emps.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = emps.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
    
}
