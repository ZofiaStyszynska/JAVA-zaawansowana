package clients;

public class MainClient {
    public static void main(String[] args) {

        Address address1 = Address.createAddress("Poznań","Ratajczaka",7,8,"61-038");
        Client client1 = new Client(Client.setFirstName(),Client.setLastName(),Client.setGender(), address1,ClientsCategory.VIP);
        client1.printOut();
        address1.printOutAddress(client1);


    }

}
