package come.itheima.studentsystem;

public class User {
    private String username;
    private String passworld;
    private String idcard;
    private int phonenumber;

    public User() {
    }

    public User(String username, String passworld, String idcard, int phonenumber) {
        this.username = username;
        this.passworld = passworld;
        this.idcard = idcard;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
