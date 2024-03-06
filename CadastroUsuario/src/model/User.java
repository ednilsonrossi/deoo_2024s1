package model;

import java.security.MessageDigest;
import java.util.Objects;

public class User implements Comparable<User>{

    private String username;
    private String name;
    protected String password;

    public User(String username, String name, String password) {
        this.username = username;
        this.name = name;
        setPassword(password);
    }

    public static boolean autenticate(User onSystem, String password){
        return onSystem.password.equals(onSystem.encryptPassword(password));
    }

    protected String encryptPassword(String passwd){
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwd.getBytes());
            byte[] digest = md.digest();
            for(byte b : digest){
                sb.append(String.format("%02x", b & 0xff));
            }
        }catch (Exception e){
            sb = new StringBuilder();
        }
        return sb.toString();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryptPassword(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int compareTo(User user) {
        if(user != null){
            return username.compareTo(user.username);
        }
        return 0;
    }

//    @Override
//    public int hashCode() {
//        return 1;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(username);
//        //return username.hashCode();
//    }


    @Override
    public int hashCode() {
        int prime = 31;
        int code = 17; //número primo inicial para evitar multiplicação por zero.
        code = prime * code + (username == null ? 0 : username.hashCode());
        code = prime * code + (name == null ? 0 : name.hashCode());
        code = prime * code + (password == null ? 0 : password.hashCode());
        return code;
    }
}
