package resources;

import java.util.List;

public interface IVideoCassetteCatalog {
    void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException;
    void addAllVideoCassette(VideoCassette ...videoCassette) throws CassetteAddException;

    List<VideoCassette> getVideoCassettes();
}
