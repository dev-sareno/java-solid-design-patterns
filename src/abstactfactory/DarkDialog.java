package abstactfactory;

public class DarkDialog extends Dialog {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0x000000);
    }
}
