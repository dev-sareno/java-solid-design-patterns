package abstactfactory;

public class LightButton extends Button {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0xFFFFFF);
    }
}
