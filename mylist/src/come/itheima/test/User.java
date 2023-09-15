package come.itheima.test;

public class User {
    String id;
    String username;
    String passwprd;

    public User() {

    }

    public User(String id, String username, String passwprd) {
        this.id = id;
        this.username = username;
        this.passwprd = passwprd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswprd() {
        return passwprd;
    }

    public void setPasswprd(String passwprd) {
        this.passwprd = passwprd;
    }
}
