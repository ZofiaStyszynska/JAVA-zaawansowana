package resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassette {
    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category;
    private Set<Actor> actors;

    public VideoCassette(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;


    }
}
