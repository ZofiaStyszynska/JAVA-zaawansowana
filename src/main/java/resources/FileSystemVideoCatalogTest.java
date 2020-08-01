package resources;

import java.math.BigDecimal;
import java.util.Set;

public class FileSystemVideoCatalogTest {
    public static void main(String[] args) throws CassetteAddException {
        FileSystemVideoCatalog fileSystemVideoCatalog = new FileSystemVideoCatalog();

        VideoCassette videoCassette1 = new VideoCassette( "VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin","Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));
        VideoCassette videoCassette2 = new VideoCassette( "VID802",
                BigDecimal.valueOf(28.0),
                "The Matrix",
                new Director("Larry","Wachowski", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Keanu", "Reeves", Gender.MALE)));
        VideoCassette videoCassette3 = new VideoCassette( "VID803",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin","Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));

        fileSystemVideoCatalog.addAllVideoCassette(videoCassette1,videoCassette2,videoCassette3);
    }
}
