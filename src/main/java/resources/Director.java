package resources;

import lombok.Getter;

@Getter
public class Director extends Person{

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void introduce(){
    System.out.println("My name is " + getFirstName() + " " + lastName + ", I'm a director");
}

    @Override
    public String toString() {
        return getFirstName() + " "+ lastName;
    }

   }
