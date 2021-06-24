package composite;

public interface IParentToDo extends IToDo {
    void add(IToDo toDo);
    void remove(IToDo toDo);
}
