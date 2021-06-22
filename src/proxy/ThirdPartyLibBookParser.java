package proxy;

import java.util.concurrent.TimeUnit;

public class ThirdPartyLibBookParser implements IThirdPartyLibBookParser {
    public ThirdPartyLibBookParser(String book) {
        // Expensive operation
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getNumberOfPages() {
        return Math.round((float) Math.random());
    }

    @Override
    public int getNumberOfWords() {
        return Math.round((float) Math.random());
    }

    @Override
    public int getNumberOfNouns() {
        return Math.round((float) Math.random());
    }
}
