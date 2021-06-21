package proxy;

public class Main {
    public static void main(String[] args) {
        ILazyBookParserProxy proxy = new LazyBookParserProxy("The book ...");
        int numberOfPages = proxy.getNumberOfPages();
        int numberOfNouns = proxy.getNumberOfNouns();
        int numberOfWords = proxy.getNumberOfWords();
    }
}
