package exceptions;

import com.fasterxml.jackson.core.io.UTF8Writer;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MainIO {


    // wylistowanie zawartości pliku
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\zosma");
        Path path = Paths.get("C:\\Users\\zosma\\Statek.txt");
        BufferedReader bufferedReader=null;
//        try {
//            bufferedReader = Files.newBufferedReader(path);
////            final List<String> strings = Files.readAllLines(path);
////            for (String string : strings) {
////                System.out.println(string);
//
//        } catch (IOException e) {
//
//            System.out.println("Plik nie istnieje");;
//        }finally {
//            bufferedReader.close();
//        }
        try(BufferedReader bufferedReader1 = Files.newBufferedReader(path)){
            String line;
            while((line = bufferedReader1.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Files.lines(path)
                .filter(p->p.contains("p"))
                .forEach(System.out::println);



//        if (file.exists()) {
//            for (File listFile : file.listFiles()) {
//                System.out.println(listFile.getName());
//            }
//
//        } else {
//            throw new FileNotFoundException("Plik (katalog) nie istnieje");
//        }
        try(BufferedWriter bufferedWriter=Files.newBufferedWriter(path, StandardOpenOption.APPEND)){
            bufferedWriter.write("\nPo głębinie statek płynie");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }}


