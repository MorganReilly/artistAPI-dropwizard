package ie.gmit.ds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.Collection;
import java.util.HashMap;

@Path("/artists")
@Produces(MediaType.APPLICATION_JSON)
public class ArtistApiResource {

    private HashMap<Integer, Artist> artistsMap = new HashMap<>();

    public ArtistApiResource() {
        Artist testArtist = new Artist(1, "The GZA", "HipHop", 2);
        artistsMap.put(testArtist.getArtistId(), testArtist);
    }

    @GET
    public Collection<Artist> getArtists() {
        // artistsMap.values() returns Collection<Artist>
        // Collection is the interface implemented by Java collections like ArrayList, LinkedList etc.
        // it's basically a generic list.
        // https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html
        return artistsMap.values();
    }


}
