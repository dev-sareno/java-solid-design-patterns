package abstact_factory;

public class LightTextField extends TextField {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0xFFFFFF);
    }
}
