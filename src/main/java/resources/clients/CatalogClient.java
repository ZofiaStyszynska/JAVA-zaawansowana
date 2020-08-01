package resources.clients;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CatalogClient {

    private final Path file = Paths.get("Katalog_klientow.txt");
    private final ObjectMapper objectMapper = new ObjectMapper();
    //private static FileWriter fileWriter = null;
   // Client client2 = new Client("Joanna", "Jankowska", Address.createAddress("Leszno","Moniuszki",15,7,"76-015"),ClientsCategory.PREMIUM, "C002");

    public void addClientToFile(Client client) {
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String string = objectMapper.writeValueAsString(client);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
