package view;

import javax.swing.*;

public class PanesView implements UserView{

    private String title;

    public PanesView(){
        title = "Usuários DEOO";
    }

    @Override
    public void showUser(String username, String name, String passwd) {
        String message = "Username: " + username + "\n" +
                "Name: " + name + "\n" +
                "Password: " + passwd + "\n";

        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void showAlert(String message) {
        JOptionPane.showMessageDialog(null,
                message,
                title + ": ATENÇÃO",
                JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void userLoginSuccess(String username) {
        JOptionPane.showMessageDialog(null,
                "Login de " + username + " realizado com sucesso!",
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void userLoginError(String username) {
        JOptionPane.showMessageDialog(null,
                "Login inválido para " + username + ", verifique username e senha.",
                title,
                JOptionPane.ERROR_MESSAGE);
    }
}
