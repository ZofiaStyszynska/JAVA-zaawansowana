package resources;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor julietteActor = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor gregActor = new Actor("Greg", "Sestero", Gender.MALE);

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(julietteActor);
        persons.add(gregActor);

        for (Person person:persons){
            person.introduce();
        }
    }
}

