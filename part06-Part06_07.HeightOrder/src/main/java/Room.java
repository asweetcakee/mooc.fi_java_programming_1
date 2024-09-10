/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author mefferio
 */
public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {

        if (this.people.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.people.get(0);
        for (Person person : this.people) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person personToTake = this.shortest();
        this.people.remove(personToTake);

        return personToTake;
    }
}
