package app.model.store.interfaces;

public class Login {
    private String email;
    private String password;

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void Login() {
        // TODO: implement login
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
