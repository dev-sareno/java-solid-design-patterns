package composite;

import java.util.ArrayList;
import java.util.List;

public class ListToDo implements IParentToDo {
    private String title;
    private List<IToDo> todos = new ArrayList<>();

    public ListToDo(String title) {
        this.title = title;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<h1>");
        html.append(this.title);
        html.append("</h1>");
        html.append("<ul>");
        for (IToDo todo: this.todos) {
            html.append("<li>");
            html.append(todo.getHtml());
            html.append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }

    @Override
    public boolean isDone() {
        for (IToDo todo: this.todos) {
            if (!todo.isDone()) {
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
