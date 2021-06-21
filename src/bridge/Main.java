package bridge;

public class Main {
    public static void main(String[] args) {
        View longView = new LongFormView(new ArtistResource(new Artist()));
        String longViewContent = longView.getContent();

        View shortView = new ShortFormView(new BookResource(new Book()));
        String shortViewContent = shortView.getContent();
    }
}
