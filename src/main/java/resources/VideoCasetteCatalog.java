package resources;//Katalog dodaje i zwraca listę dostępnych video casette

import resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class VideoCasetteCatalog implements IVideoCassetteCatalog{
    private final List<VideoCassette> cassettes = new ArrayList<>();
    VideoCassette video1 = new VideoCassette( "VID801",
            BigDecimal.valueOf(28.0),
            "Pewnego razu w Hollywood",
            new Director("Quentin","Tarantino", Gender.MALE),
            Category.DRAMA,
            Set.of(new Actor("Brad", "Pitt", Gender.MALE)));

//    public static List makeVideoCassetteList(VideoCassette videoCassette) {
//        List<VideoCassette> videoCassetteList = new ArrayList<>();
//        for (VideoCassette cassette : videoCassetteList) {
//            videoCassetteList.add(videoCassette);
//        }
//
//
//        return new ArrayList();
//    }



    public void addVideoCassette(VideoCassette videoCassette) {
        cassettes.add(video1);
    }

    @Override
    public void addVideoCassette(VideoCassette... videoCassette) {
        for (VideoCassette cassette : videoCassette) {
            addVideoCassette(cassette);
        }


    }

    public List<VideoCassette> getVideoCassettes() {
        return cassettes;
    }
}
