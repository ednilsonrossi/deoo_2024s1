package model;

public class UserPersistence extends User{

    public UserPersistence(String username, String name, String password) {
        super(username, name, password);
        setPassword(password);
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
