package view;

public class ConsoleView implements UserView{

    @Override
    public void showUser(String username, String name, String passwd) {
        System.out.println("\t >> USUÁRIO <<");
        System.out.println("Username.............: " + username);
        System.out.println("Nome Completo........: " + name);
        System.out.println("Senha (criptografada): " + passwd);
    }

    @Override
    public void showAlert(String message) {
        System.out.println("\t >> ATENÇÃO <<");
        System.out.println("*****************************");
        System.out.println(message);
        System.out.println("*****************************");
    }

    @Override
    public void userLoginSuccess(String username) {
        System.out.printf("Login de %s realizado com sucesso!\n", username);
    }

    @Override
    public void userLoginError(String username) {
        System.out.printf("Login inválido para %s, verifique username e senha.\n", username);
    }
}
