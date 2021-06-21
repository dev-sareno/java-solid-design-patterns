package bridge;

public class ArtistResource implements IResource {
    private Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return this.artist.getName() + this.artist.getBio() + this.artist.getUrl();
    }
}
