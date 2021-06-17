package abstactfactory;

public class LightDialog extends Dialog {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0xFFFFFF);
    }
}
