package Clients;

public class MainClient {
    public static void main(String[] args) {
       // ClientsAddress.setClientsAddress("Poznań", "Ratajczaka",7,9,"765-8765");
        Client client1 = new Client(Client.setFirstName(),Client.setLastName(),Client.setGender(),ClientsAddress.setClientsAddress("Poznań","Ratajczaka",7,8,"61-038"),ClientsCategory.VIP);
        client1.printOut();
        //Nie umiem wywołać tu metody printClientsAddress utworzonej w klasie ClientsAddress

    }

}
