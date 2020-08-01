package resources.clients;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Scanner;
@Getter
public class Client {
    private String firstName;
    private String lastName;
    private Address address;
    private ClientsCategory category;
    private String clientsID;


@JsonCreator
    public Client(@JsonProperty ("firstName") String firstName,@JsonProperty("lastName") String lastName,@JsonProperty("address") Address address, @JsonProperty("category") ClientsCategory category, @JsonProperty("clientsID") String clientsID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.category = category;
        this.clientsID = clientsID;
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client collectClientData() {
        Scanner scanner = new Scanner(System.in);
        //List<Client> resources.clients = new ArrayList<>();
        String anwser = null;
        do {
            System.out.println("Podaj imie");
            String firstname = scanner.next();
            System.out.println("Podaj nazwisko");
            String lastname = scanner.next();
            //resources.clients.add(new Client(firstname, lastname));
            System.out.println("Utworzyc nastepnego? t/n - (tak, przerwij)");
            anwser = scanner.next();
        }
        while (anwser.equals("t"));
        //System.out.println("Lista klientow");
        //resources.clients.forEach(System.out::println);
        return new Client(firstName,lastName);
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


    public void printOut() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dane klienta")
                .append("\nimię: ")
                .append(this.firstName)
                .append("\nNazwisko: ")
                .append(this.lastName)
                .append("\nPłeć: ");
        System.out.println(stringBuilder.toString());
    }
}
