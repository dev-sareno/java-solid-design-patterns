package composite;

import java.util.ArrayList;
import java.util.List;

public class MyToDo implements IParentToDo {
    private String title;
    private List<IToDo> todos = new ArrayList<>();

    public MyToDo(String title) {
        this.title = title;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head>");
        html.append("<title>");
        html.append(this.title == null ? "" : this.title);
        html.append("</title>");
        html.append("</head>");
        html.append("<body>");
        for (IToDo toDo: this.todos) {
            html.append("<li>");
            html.append(toDo.getHtml());
            html.append("</li>");
        }
        html.append("</body>");
        html.append("</html>");
        return html.toString();
    }

    @Override
    public boolean isDone() {
        for (IToDo toDo: this.todos) {
            if (!toDo.isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void add(IToDo toDo) {
        this.todos.add(toDo);
    }

    @Override
    public void remove(IToDo toDo) {
        this.todos.remove(toDo);
    }
}
