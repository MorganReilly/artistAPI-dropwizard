package ie.gmit.ds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

    private int artistId;
    private String artistName;
    private String artistGenre;
    private int albumsRecorded;


    /**
     * No arg constructor
     * Needed for Jackson deserialisation
     */
    public Artist() {
    }

    /**
     * 4 Param constructor
     *
     * @param artistId
     * @param artistName
     * @param artistGenre
     * @param albumsRecorded
     */
    public Artist(int artistId, String artistName, String artistGenre, int albumsRecorded) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.albumsRecorded = albumsRecorded;
    }

    /**
     * Note: This class only has getters
     * No setters
     * This is because we want our class to be immutable
     * Each getter needs @JsonProperty annotation
     */

    @JsonProperty
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty
    public String getArtistGenre() {
        return artistGenre;
    }

    @JsonProperty
    public int getAlbumsRecorded() {
        return albumsRecorded;
    }

    @JsonProperty
    public int getArtistId() {
        return artistId;
    }
}
