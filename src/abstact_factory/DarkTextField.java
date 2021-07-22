package abstact_factory;

public class DarkTextField extends TextField {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0x000000);
    }
}
