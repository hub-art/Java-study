package come.itheima.studentsystem;

public class User {
    private String username;
    private String passworld;
    private String personID;
    private int phoneNumber;

    public User() {
    }

    public User(String username, String passworld, String personID, int phoneNumber) {
        this.username = username;
        this.passworld = passworld;
        this.personID = personID;
        this.phoneNumber = phoneNumber;
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

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
