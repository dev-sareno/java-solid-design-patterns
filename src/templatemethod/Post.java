package templatemethod;

public class Post extends Record {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean validate() {
        return this.text != null && this.text.length() > 0;
    }

    @Override
    public void onValidateError() {

    }
}
