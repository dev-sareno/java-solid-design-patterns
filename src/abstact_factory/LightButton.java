package abstact_factory;

public class LightButton extends Button {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0xFFFFFF);
    }
}
