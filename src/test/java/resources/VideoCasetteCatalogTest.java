package resources;


import org.junit.Test;
import resources.*;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoCasetteCatalogTest {
    @Test
    public void shouldCreateCatalogThatIsEmpty(){
        //when
        IVideoCassetteCatalog catalog = new VideoCasetteCatalog();
        //then
        assertThat(catalog.getVideoCassettes()).isEmpty();
    }
    @Test
    public void shouldAddVideoCassetteToCatalog(){
        //given
        IVideoCassetteCatalog catalog = new VideoCasetteCatalog();
        VideoCassette videoCassette = new VideoCassette( "VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin","Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));
        //when
        catalog.addVideoCassette(videoCassette);
        //then
        assertThat(catalog.getVideoCassettes())
        .hasSize(1);
    }
    @Test
    public void shouldAddMoreThanOneCassettesToTheCatalog(){
        IVideoCassetteCatalog catalog = new VideoCasetteCatalog();
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
        catalog.addVideoCassette(videoCassette1, videoCassette2);
        //catalog.addVideoCassette(videoCassette2);
        assertThat(catalog.getVideoCassettes())
                .hasSize(2);
    }

}