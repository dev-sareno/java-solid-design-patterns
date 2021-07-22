package template_method;

public class Main {
    public static void main(String[] args) {
        Record user = new User();
        user.save();

        Record post = new Post();
        post.save();
    }
}
