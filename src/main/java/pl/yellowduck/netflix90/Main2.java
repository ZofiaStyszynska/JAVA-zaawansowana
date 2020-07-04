package pl.yellowduck.netflix90;

import lombok.Setter;
import resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor julietteActor = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor gregActor = new Actor("Greg", "Sestero", Gender.MALE);

        List<Person> persons = new ArrayList();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(julietteActor);
        persons.add(gregActor);

        for (Person person : persons) {
            person.introduce();

        }
        Set<Actor> actors = new HashSet<>();
        actors.add(tommyActor);
        actors.add(julietteActor);
        actors.add(gregActor);


//        for (int i = 0; i < persons.size() - 1; i++) {
//            Person person = persons.get(i);
//            person.introduce();
//        }
        VideoCassette theRoom = new VideoCassette(
                "VID801",
                BigDecimal.valueOf(28.0),
                "The Room",
                tommy,
                Category.DRAMA,
                Set.of(tommyActor, julietteActor, gregActor));

        theRoom.printOut();

    }


}
