package proxy;

import java.util.concurrent.TimeUnit;

public class ThirdPartyLibBookParser {
    public ThirdPartyLibBookParser(String book) {
        // Expensive operation
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfPages() {
        return Math.round((float) Math.random());
    }

    public int getNumberOfWords() {
        return Math.round((float) Math.random());
    }

    public int getNumberOfNouns() {
        return Math.round((float) Math.random());
    }
}
