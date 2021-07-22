package abstact_factory;

public class LightDialog extends Dialog {
    @Override
    UIComponent getComponent() {
        return new UIComponent(0xFFFFFF);
    }
}
