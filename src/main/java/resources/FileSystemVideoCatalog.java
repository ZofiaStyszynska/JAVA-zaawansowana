package resources;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCatalog extends UniqueVideoCassetteCatalog {
    private final Path file = Paths.get("cassettes.txt");
    private final ObjectMapper objectMapper = new ObjectMapper();

//nie używać throws w konstruktorze
    public FileSystemVideoCatalog(){
        try{
            if (!Files.exists(file))
            Files.createFile(file);

        }catch(IOException e){
            throw new CassetteReadException("Cannot create file");
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
           String line;
           while((line = bufferedReader.readLine()) != null){
               VideoCassette cassette = objectMapper.readValue(line,VideoCassette.class);
               super.addVideoCassette(cassette);
           }
        } catch (IOException | CassetteAddException e) {
            System.out.println(e.getMessage());;
            throw new CassetteReadException("Cannot read file");
        }
    }

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException {
        super.addAllVideoCassette(videoCassette);
        //dzięki temu, że jest to w nawiasie za try, nie musimy zamykać bufferedWriter w bloku finally - close()

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            //uzyskujemy Stringową reprezentacja obiektu:
            String string = objectMapper.writeValueAsString(videoCassette);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        } catch (FileNotFoundException e) {
            throw new CassetteAddException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        }
    }

    @Override
    public void addAllVideoCassette(VideoCassette... videoCassette) throws CassetteAddException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (VideoCassette cassette : videoCassette) {
                super.addVideoCassette(cassette);
                String string = objectMapper.writeValueAsString(cassette);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new CassetteAddException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        }
    }
}
