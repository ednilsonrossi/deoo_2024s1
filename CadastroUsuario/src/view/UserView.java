package view;

public interface UserView {

    void showUser(String username, String name, String passwd);

    void showAlert(String message);

    void userLoginSuccess(String username);

    void userLoginError(String username);
}
