package resources;

public class Actor extends Person {



    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);

    }



    public void introduce(){
//        if (gender.equals(Gender.MALE)){ //lub(Gender.Male==gender) - porównanie adresów w pamięci
//       System.out.println("My name is " + firstName + " " + lastName + ", I'm an actor");}
//        else {
//            System.out.println("My name is " + firstName + " " + lastName + ", I'm an actress");
//        }
        switch (this.gender){
            case MALE:
                System.out.println("My name is " + firstName + " " + lastName + ", I'm an actor");
            case FEMALE:
                System.out.println("My name is " + firstName + " " + lastName + ", I'm an actress");
        }

   }
   }
