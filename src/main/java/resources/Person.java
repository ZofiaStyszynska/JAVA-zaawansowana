package resources;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Person {
    private String firstName;
    protected String lastName;
    protected final Gender gender;

    public abstract void introduce();

    public String toString() {
        return firstName + " "+ lastName;
    }}

