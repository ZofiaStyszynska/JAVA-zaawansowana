package resources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueVideoCassetteCatalog implements IVideoCassetteCatalog {
    private final Set<VideoCassette> cassettes = new HashSet<>();

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException {

        if(!cassettes.add(videoCassette)){
            throw new CassetteAddException("Casette already added");
        }
    }

    @Override
    public void addAllVideoCassette(VideoCassette... videoCassette) throws CassetteAddException {
        for (VideoCassette cassette : videoCassette) {
            addAllVideoCassette(cassette);
        }

    }

    @Override
    public List<VideoCassette> getVideoCassettes() {
        return new ArrayList<>(cassettes);
    }

}
