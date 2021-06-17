package abstactfactory;

public abstract class ThemeFactory {
    abstract Drawable getButton();
    abstract Drawable getTextField();
    abstract Drawable getDialog();
}
