package resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;
@Getter
public class VideoCassette {
    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category;
    private Set<Actor> actors;

    @JsonCreator
    public VideoCassette(@JsonProperty("id") String id, @JsonProperty ("price") BigDecimal price,
                         @JsonProperty ("title") String title, @JsonProperty("director") Director director,
                         @JsonProperty("category") Category category, @JsonProperty("actor") Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;


    }

    public void printOut() {
        StringBuilder builder = new StringBuilder();
        //   | ID | Title | Category | Director | Actors |
        builder.append("| ")
                .append(this.id)
                .append(" | ")
                .append(this.title)
                .append(" | ")
                .append(this.category)
                .append(" | ")
                .append(this.price)
                .append(" | ")
                .append(this.director.toString())
                .append(" | ")
                .append(this.actors.toString())
                .append(" | ");
        System.out.println(builder.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoCassette that = (VideoCassette) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "VideoCassette{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", director=" + director +
                ", category=" + category +
                ", actors=" + actors +
                '}';
    }
}
