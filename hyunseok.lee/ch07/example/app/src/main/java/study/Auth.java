package study;

public class Auth {
    private String id;
    private String username;

    public Auth(String id, String username){
        this.id = id;
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
