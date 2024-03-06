package controller;

import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dao.UserDaoSetImpl;
import view.UserView;

import java.util.Iterator;

public class UserController {

    private UserView view;
    private UserDao dao;

    public UserController(UserView view) {
        this.view = view;
        //dao = UserDaoImpl.getInstance();
        dao = UserDaoSetImpl.getInstance();
    }

    public void run(){
        load();
        showAll();
        login("ednilson", "java eh 10");
        login("zezinho", "donald");
    }

    private void login(String username, String password){
        User user = dao.getByUsername(username);
        if(user == null){
            view.showAlert(String.format("O usuário %s não está cadastrado no sistema.\n", username));
        }else{
            if(User.autenticate(user, password)){
                view.userLoginSuccess(username);
            }else {
                view.userLoginError(username);
            }
        }
    }

    private void showAll(){
        User user;
        Iterator<User> iterator = dao.getAll().iterator();
        while (iterator.hasNext()){
            user = iterator.next();
            view.showUser(user.getUsername(), user.getName(), user.getPassword());
        }
    }

    private void load(){
        dao.insert(new User("ednilson", "Ednilson Rossi", "123"));
        dao.insert(new User("ednilson", "Ednilson Rossi", "123"));
        dao.insert(new User("ednilson", "Ednilson Rossi", "123"));
        dao.insert(new User("huguinho", "Huey Duck", "donald"));
        dao.insert(new User("zezinho", "Dewey Duck", "donald"));
        dao.insert(new User("luizinho", "Louie Duck", "donald"));
    }
}
