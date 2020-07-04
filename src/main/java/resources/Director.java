package resources;

public class Director extends Person{

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void introduce(){
    System.out.println("My name is " + firstName + " " + lastName + ", I'm a director");
}
}
