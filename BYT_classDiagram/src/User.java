import java.util.Date;

public class User {
    private String login;
    private String password;
    private Date dateCreated;

    public User() {
        dateCreated = new Date();
    }

    public User(String login, String password, Date dateCreated) {
        this.login = login;
        this.password = password;
        this.dateCreated = dateCreated;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login.length()<8){
            throw new IllegalArgumentException("The login is less then 8 characters");
        }
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if (password.length()<8){
            throw new IllegalArgumentException("The password is less then 8 characters");
        }
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int login(){
        return 0;
    }

    public int createAccount(){
        return 0;
    }
}
