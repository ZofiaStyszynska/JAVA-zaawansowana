package resources;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected final Gender gender;

    public Person(String firstName, String lastName,Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public abstract void introduce();
    }

