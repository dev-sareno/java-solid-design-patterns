package abstact_factory;

public class DarkThemeFactory extends ThemeFactory {
    @Override
    Drawable getButton() {
        return new DarkButton().getComponent();
    }

    @Override
    Drawable getTextField() {
        return new DarkTextField().getComponent();
    }

    @Override
    Drawable getDialog() {
        return new DarkDialog().getComponent();
    }
}
