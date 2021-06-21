package bridge;

public class LongFormView extends View {
    public LongFormView(IResource resource) {
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
