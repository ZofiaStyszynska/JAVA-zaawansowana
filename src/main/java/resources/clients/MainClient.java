package resources.clients;

public class MainClient {
    public static void main(String[] args) {

//        Address address1 = Address.createAddress("Poznań","Ratajczaka",7,8,"61-038");
//        Client client1 = new Client(Client.setFirstName(),Client.setLastName(), address1,ClientsCategory.VIP,"C001");
//        client1.printOut();
//        address1.printOutAddress(client1);

        Client client2 = new Client("Joanna", "Jankowska", Address.createAddress("Leszno","Moniuszki",15,7,"76-015"),ClientsCategory.PREMIUM, "C002");

 CatalogClient catalogClient= new CatalogClient();
 catalogClient.addClientToFile(client2);

    }

}
