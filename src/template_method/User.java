package template_method;

public class User extends Record {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean validate() {
        return this.username != null && this.username.length() > 0;
    }

    @Override
    public void onValidateError() {

    }
}
