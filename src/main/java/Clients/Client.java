package Clients;

import java.util.Scanner;

public class Client {
    private String firstName;
    private String lastName;
    private String gender;
    ClientsAddress address;
    ClientsCategory category;

    public Client(String firstName, String lastName, String gender, ClientsAddress address, ClientsCategory category) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.category = category;
    }

    public static String getData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String setFirstName() {
        System.out.println("Imię klienta: ");
        return getData();
    }

    public static String setLastName() {
        System.out.println("Nazwisko klienta: ");
        return getData();
    }

    public static String setGender() {
        System.out.println("Płeć klienta (\"m\" lub \"k\": ");
        return getData();
    }

    public void printOut() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dane klienta")
                .append("\nimię: ")
                .append(this.firstName)
                .append("\nNazwisko: ")
                .append(this.lastName)
                .append("\nPłeć: ")
                .append(this.gender);
        System.out.println(stringBuilder.toString());
    }
}
