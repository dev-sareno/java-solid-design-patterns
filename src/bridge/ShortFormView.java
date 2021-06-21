package bridge;

public class ShortFormView extends View {
    public ShortFormView(IResource resource) {
        super(resource);
    }

    private String applyDesigns(String content) {
        return "Design 1" + content + "Design 2";
    }

    @Override
    public String getContent() {
        return this.applyDesigns(this.resource.snippet());
    }
}
