package resources;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoCassetteTest {
    @Test
    public void shouldVideoCassetteBeEqual() {
        //given
        VideoCassette videoCassette1 = new VideoCassette("VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin", "Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));
        VideoCassette videoCassette2 = new VideoCassette("VID801",
                BigDecimal.valueOf(28.0),
                "The Matrix",
                new Director("Larry", "Wachowski", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Keanu", "Reeves", Gender.MALE)));
        VideoCassette videoCassette3 = new VideoCassette("VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin", "Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));


        //when
        boolean result = videoCassette1.equals(videoCassette2);

        //then
        assertThat(result).isTrue();
        assertThat(videoCassette1.hashCode()).isEqualTo(videoCassette2.hashCode());
    }
    @Test
    public void shouldVideoCassetteNotBeEqual() {
        //given
        VideoCassette videoCassette1 = new VideoCassette("VID801",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin", "Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("VID802",
                BigDecimal.valueOf(28.0),
                "Pewnego razu w Hollywood",
                new Director("Quentin", "Tarantino", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Brad", "Pitt", Gender.MALE)));


        //when
        boolean result = videoCassette1.equals(videoCassette2);

        //then
        assertThat(result).isFalse();
        assertThat(videoCassette1.hashCode()).isNotEqualTo(videoCassette2.hashCode());
    }

}