package resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Director extends Person{
@JsonCreator
    public Director(@JsonProperty("First name") String firstName,@JsonProperty("Last name") String lastName, @JsonProperty("gender") Gender gender) {
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
