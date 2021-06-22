package proxy;

public class LazyBookParserProxy implements IThirdPartyLibBookParser {
    private ThirdPartyLibBookParser parser;
    private String book;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (this.parser == null) {
            this.parser = new ThirdPartyLibBookParser(this.book);
        }
        return this.parser.getNumberOfPages();
    }

    @Override
    public int getNumberOfWords() {
        if (this.parser == null) {
            this.parser = new ThirdPartyLibBookParser(this.book);
        }
        return this.parser.getNumberOfWords();
    }

    @Override
    public int getNumberOfNouns() {
        if (this.parser == null) {
            this.parser = new ThirdPartyLibBookParser(this.book);
        }
        return this.parser.getNumberOfNouns();
    }
}
