package resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

public class UniqueVideoCassetteCatalogTest {

    @Test
    public void shouldNotAddSameIdVideoCassette() throws CassetteAddException {
        //given

        VideoCassette videoCassette1 = new VideoCassette( "VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin","Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));
        VideoCassette videoCassette2 = new VideoCassette( "VID801",
                BigDecimal.valueOf(28.0),
                "The Matrix",
                new Director("Larry","Wachowski", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Keanu", "Reeves", Gender.MALE)));
        VideoCassette videoCassette3 = new VideoCassette( "VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin","Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));

        IVideoCassetteCatalog catalog = new UniqueVideoCassetteCatalog();

        //when
        catalog.addAllVideoCassette(videoCassette1,videoCassette3);
        //then
        Assertions.assertThat(catalog.getVideoCassettes())
                .hasSize(1);
    }

}