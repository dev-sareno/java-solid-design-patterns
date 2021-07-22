package abstact_factory;

public class Main {
    private static final boolean USE_DARK_THEME = true;

    public static void main(String[] args) {
        ThemeFactory themeFactory = USE_DARK_THEME ? new DarkThemeFactory() : new LightThemeFactory();
        Drawable button = themeFactory.getButton();
        Drawable textField = themeFactory.getTextField();
        Drawable dialog = themeFactory.getDialog();
    }
}
