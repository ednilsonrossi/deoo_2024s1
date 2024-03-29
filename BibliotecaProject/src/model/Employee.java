package model;

public class Employee extends User{

    public Employee(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public int getDaysBorrow() {
        return 15;
    }
}
