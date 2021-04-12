package study;

public class User {

    private String userName;

    public User (String name) {
        this.userName = name;
    }

    public boolean equalPassword(String pw) {
        return true;
    }

    public String getUserName() {
        return userName;
    }

}
