package bridge;

public class BookResource implements IResource {
    private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return this.book.getAuthor() + this.book.getTitle() + this.book.getDescription();
    }
}
