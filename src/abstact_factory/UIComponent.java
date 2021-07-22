package abstact_factory;

public class UIComponent implements Drawable {
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public UIComponent(int color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawn!");
    }
}
