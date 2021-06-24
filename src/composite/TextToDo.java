package composite;

public class TextToDo implements IToDo {
    private String text;
    private boolean isDone;

    public TextToDo(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String getHtml() {
        return this.text;
    }

    @Override
    public boolean isDone() {
        return this.isDone;
    }
}
