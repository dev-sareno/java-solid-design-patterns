package abstactfactory;

public class DarkButton extends Button {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0x000000);
    }
}
