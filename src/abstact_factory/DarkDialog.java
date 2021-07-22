package abstact_factory;

public class DarkDialog extends Dialog {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0x000000);
    }
}
