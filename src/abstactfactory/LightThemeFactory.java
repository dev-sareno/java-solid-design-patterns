package abstactfactory;

public class LightThemeFactory extends ThemeFactory {
    @Override
    Drawable getButton() {
        return new LightButton().getComponent();
    }

    @Override
    Drawable getTextField() {
        return new LightTextField().getComponent();
    }

    @Override
    Drawable getDialog() {
        return new LightDialog().getComponent();
    }
}
