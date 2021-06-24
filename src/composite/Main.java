package composite;

public class Main {
    public static void main(String[] args) {
        IParentToDo myToDo = new MyToDo("Grocery");
        myToDo.add(new TextToDo("Toothpaste", false));
        myToDo.add(new TextToDo("Soap", false));
        myToDo.add(new TextToDo("Milk", false));
        myToDo.add(new TextToDo("Sugar", false));

        IParentToDo subToDo = new ListToDo("Hardware Stuff");
        subToDo.add(new TextToDo("Nail", false));
        subToDo.add(new TextToDo("Solvent", false));
        subToDo.add(new TextToDo("Glue", false));
        myToDo.add(subToDo);

        System.out.println(myToDo.getHtml());
    }
}
